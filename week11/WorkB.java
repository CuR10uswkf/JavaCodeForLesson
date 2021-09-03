package pers.wkf.week11;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2020.11.11 13:45
 */
public class WorkB {
    public static Boolean isPrime(int num){
        if(num <= 2){
            return false;
        }
        if(num == 3){
            return true;
        }else{
            int a = (int)Math.sqrt(num);
            for(int i = 2; i <= a ; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void checkArray(List nums) {

        for(int i = 0;i < nums.size();i++)
        {
            Map<Integer,Boolean> mapTemp = (Map<Integer,Boolean>)nums.get(i);
            List list=new ArrayList(mapTemp.keySet());
            Boolean flag = isPrime((Integer)list.get(0));
            ((Map<Integer, Boolean>) nums.get(i)).put((Integer) list.get(0),flag);
            String temp = flag == false?"no":"yes";
            System.out.println(i+1 + ": " + temp );
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Map<Integer,Boolean>> nums = new LinkedList();

        while (scanner.hasNextLine()){
            int num = scanner.nextInt();
            if (num<=0){
                checkArray(nums);
                //printResult(nums);
            //    System.out.println(nums);
                break;
            }else {
                Map<Integer,Boolean> map = new LinkedHashMap<>();
                map.put(num,true);
                nums.add(map);
            }
            scanner.nextLine();
        }
    }
}
