package pers.wkf.week18;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkG
 * @Author WKF
 * @Date 2020.12.30 14:28
 */
public class WorkG {
    public static int calc(int num){
        if (num == 0){
            return 0;
        } else if (num == 1){
            return 1;
        }else {
            return calc(num-1)+calc(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum = scanner.nextInt();
        while (lineNum>0){
            int num = scanner.nextInt();
            int result = calc(num);
            System.out.println(result);
            lineNum--;
        }
    }
}
