package pers.wkf.week18;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkD
 * @Author WKF
 * @Date 2020.12.30 14:20
 */
public class WorkD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int count=5;
        while(count>0){
            int numTemp = scanner.nextInt();
            if (numTemp<a){
                sum=sum+numTemp;
            }
            count--;
        }
        System.out.println(sum);
    }
}
