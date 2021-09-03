package pers.wkf.week18;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkI
 * @Author WKF
 * @Date 2020.12.30 14:16
 */
public class WorkI {
    public static int calcAB(int num1, int num2){
        return  num1+num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum = scanner.nextInt();
        //scanner.hasNextLine();
        while (lineNum > 0){
            scanner.hasNextLine();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = calcAB(a,b);
            System.out.println(sum);
            lineNum--;
        }
    }
}
