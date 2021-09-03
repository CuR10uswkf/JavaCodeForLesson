package pers.wkf.week11;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkD
 * @Author WKF
 * @Date 2020.11.11 15:10
 */
public class WorkD {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int num = scanner.nextInt();
            int count = 0;
            if (num == 0) {
                break;
            } else {
                for (int i = 1; i < num; i++) {
                    if (isPrime(i) == true && isPrime(num - i) == true) {
                        count++;
                    }
                }
                count = count / 2;
                if (isPrime(num) == true) {
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}
