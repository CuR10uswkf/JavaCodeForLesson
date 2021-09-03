package pers.wkf.week10;

import java.util.Scanner;

/**
 * @Description
 * @ClassName LCM_C
 * @Author WKF
 * @Date 2020.11.04 14:36
 */
public class LCM_C {

    public static Integer getGcd(Integer a, Integer i){
        if (i == 0){
            return a;
        }
        Integer min = Math.min(a, i);
        Integer max = Math.max(a, i);
        return getGcd(min, max%min);
    }

    public static Integer getLcm(Integer a, Integer b){
        return (a*b)/getGcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println(getLcm(a,b));
        }
    }
}
