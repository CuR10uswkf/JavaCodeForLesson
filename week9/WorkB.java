package pers.wkf.week9;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2020.10.28 15:26
 */
public class WorkB {

    public static long getAllRight(int m, int n){
        long temp1 = factorial(n);
        long temp2 = factorial(m);
        long temp3 = factorial(n-m);

        return temp1/(temp2*temp3);
    }

    public static long factorial(int num){
        if (num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static long getAllWrongCase(int num){
        if (num == 2){
            return 1;
        }
        if (num == 1){
            return 0;
        }
        return (num - 1) * (getAllWrongCase(num-1) + getAllWrongCase(num-2));
    }

    public static void main(String[] args) {
        int famliyNum ;
        int wrongMan ;

        Scanner scan = new Scanner(System.in);
        int allLine = scan.nextInt();
        int i = 0;
        while (scan.hasNextLine()){
            if (i>=allLine){
                break;
            }
            scan.nextLine();
            i++;
            famliyNum = scan.nextInt();
            wrongMan = scan.nextInt();

            int rightMan = famliyNum-wrongMan;
            long allCase;

            long rightCase = getAllRight(rightMan, famliyNum);

            allCase =rightCase * getAllWrongCase(wrongMan);
            System.out.println(allCase);

        }

    }
}
