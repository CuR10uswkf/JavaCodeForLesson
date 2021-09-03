package pers.wkf.week18;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkJ
 * @Author WKF
 * @Date 2020.12.30 14:06
 */
public class WorkJ {
    public static int calcAB(int num1, int num2){
        return  num1+num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = calcAB(a,b);
            System.out.println(sum);
            System.out.println();
        }
    }
}
