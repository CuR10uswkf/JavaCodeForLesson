package pers.wkf.week11;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkA
 * @Author WKF
 * @Date 2020.11.11 15:25
 */
public class WorkA {
    public static int MAX = 0;
    public static int FACTOR = 0;

    public static void factorize(int num){
        int temp = num;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i == 0) {
                if (i>MAX){
                    MAX = i;
                    FACTOR = temp;
                }
  //              System.out.print(i+"*");
                num/=i;
                i--;
            }
        }
  //      System.out.println(num);
        if (num > MAX){
            MAX = num;
            FACTOR = temp;
        }
    }

    public static void checkArray(List nums){
        for (Object num : nums){
            //System.out.println(num.toString());
            factorize((Integer) num);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new LinkedList();
        int checkOverLine = 0;
        int lineCount = scanner.nextInt();
        while (scanner.hasNextLine()) {
            scanner.hasNextLine();

            if (checkOverLine < lineCount) {
                int num = scanner.nextInt();
                checkOverLine++;
                nums.add(num);
            } else {
                checkArray(nums);
                System.out.println(FACTOR);
                break;
            }
        }
    }
}
