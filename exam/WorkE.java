package pers.wkf.exam;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkE
 * @Author WKF
 * @Date 2021.01.01 13:28
 */
public class WorkE {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numStr = scanner.nextInt();
        scanner.nextLine();
        int numOfX = 0;
        int numOfY = 0;
        String str1 = scanner.nextLine();
        char[] charArray = str1.toCharArray();
        for(char ch:charArray){
            if (ch=='x'){
                numOfX++;
            }else {
                numOfY++;
            }
        }
        if (numOfX>numOfY){
            System.out.println((numOfX-numOfY)/2);
        }else {
            System.out.println((numOfY-numOfX)/2);
        }

    }
}
