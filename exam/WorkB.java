package pers.wkf.exam;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2021.01.01 12:37
 */
public class WorkB {
/*    public static BigInteger calc(BigInteger a,BigInteger b){
        BigInteger sum = BigInteger.valueOf(0);
        for (long i = a; i<=b;i++){
            sum = (sum + Math.pow(4,i))%(1e9+7);
        }
        return sum;
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(a + " " + b);
        }
    }
}
