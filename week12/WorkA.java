package pers.wkf.week12;

import java.util.*;

/**
 * @Description
 * @ClassName WorkA
 * @Author WKF
 * @Date 2020.11.18 13:43
 */
public class WorkA {
    public static Stack<String> target=new Stack<String>();

    public static void lastExpressValue(String str) {
        String temp=new String();
        String operator="+-*/";
        double num1=0;
        double num2=0;
        double numresult=0;

        for(int i=0; i<str.length(); i++) {
            if(!str.substring(i,i+1).equals(" ")) {
                temp=temp+str.substring(i,i+1);
                continue;
            }
            else {

                if(!operator.contains(temp)) {
                    target.push(temp);

                }
                if(operator.contains(temp)) {
                    if(!target.isEmpty()) {
                        num2=Double.parseDouble(target.pop());
                        if(!target.isEmpty())
                            num1=Double.parseDouble(target.pop());
                    }

                    if(temp.equals("+")) {
                        numresult=num1+num2;
                    }
                    if(temp.equals("-")) {
                        numresult=num1-num2;
                    }
                    if(temp.equals("*")) {
                        numresult=num1*num2;
                    }
                    if(temp.equals("/")) {
                        numresult=num1/num2;
                    }
                    target.push(Double.toString(numresult));

                }
                temp="";
            }
        }
        if(!target.isEmpty()) {
            numresult=Double.parseDouble(target.pop());
        }
        System.out.printf("%.2f%n",numresult);
    }

    public static void calc(String str){
        Stack stack = new Stack();
        char strArray[] =str.toCharArray();
        for (char s:strArray){
            switch (s){
                case '+':
                    int num11 = Integer.valueOf(stack.pop().toString());
                    int num12 = Integer.valueOf(stack.pop().toString());
                    stack.push(num11+num12);
                    break;
                case '-':
                    int num21 = Integer.valueOf(stack.pop().toString());
                    int num22 = Integer.valueOf(stack.pop().toString());
                    stack.push(num21-num22);
                    break;
                case '*':
                    int num31 = Integer.valueOf(stack.pop().toString());
                    int num32 = Integer.valueOf(stack.pop().toString());
                    stack.push(num31*num32);
                    break;
                case '/':
                    int num41 = Integer.valueOf(stack.pop().toString());
                    int num42 = Integer.valueOf(stack.pop().toString());
                    System.out.println(num42);
                    stack.push(num41/num42);
                    break;
                default:
                    stack.push(s);
                    break;
            }
        }
        System.out.println(stack.pop());
    }

    public static String infixToPostfix(String exp){
        Stack<Character> stack = new Stack<Character>();
        String suffix = "";
        int index = 0;
        int length = exp.length();
        while(index < length){
            switch(exp.charAt(index)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    suffix += exp.charAt(index);
                    break;
                case '*':
                case '/':
                    stack.push(exp.charAt(index));
                    break;
                case '(':
                    stack.push(exp.charAt(index));
                    break;
                case '+':				// 碰到'+''-'，将栈中所有运算符弹出，送到输出队列中
                case '-':
                    while (stack.size() != 0) {
                        char temp = stack.pop();
                        if (temp == '(') {
                            stack.push('(');
                            break;
                        }
                        suffix += temp;
                    }
                    stack.push(exp.charAt(index));
                    break;
                case ')':
                    while(!stack.isEmpty() && stack.peek() != '('){
                        suffix += stack.pop();
                        suffix += " ";
                    }
                    stack.pop();

                    break;

            }
            index++;
        }
        while(!stack.isEmpty()){
           // suffix += stack.pop();
            System.out.println(stack.pop());
        }
        return suffix;
    }

    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
             if (str.equals('0')){
                 break;
             }*/
        String str = "4 + 2 * 5 - 7 / 11";
        System.out.println(infixToPostfix(str.replace(" ", "")));
        //lastExpressValue(infixToPostfix(str.replace(" ", "")));
        //lastExpressValue("2 3 4 + * 7 - ");
    }
}
