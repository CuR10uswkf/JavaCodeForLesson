package pers.wkf.week10;

import java.util.Scanner;

/**
 * @Description
 * @ClassName GCD
 * @Author WKF
 * @Date 2020.11.04 13:45
 */
public class GCD {
    public static int getGcd(int a, int i){
        if (i == 0){
            return a;
        }
        int min = Math.min(a, i);
        int max = Math.max(a, i);
        return getGcd(min, max%min);
    }
    public static void getAnother(int a, int b){
        if (b == a){
            System.out.println(a);
        }else{
            for (int i = b+1; i<=a; i++){
                if (getGcd(a, i) == b){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalData = scanner.nextInt();
        while (scanner.hasNextLine()){
            if (totalData <= 0){
                break;
            }
            scanner.nextLine();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            totalData--;
            getAnother(a,b);
        }
    }
}
