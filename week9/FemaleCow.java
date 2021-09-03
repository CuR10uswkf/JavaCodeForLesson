package pers.wkf.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description
 * @ClassName FemaleCow
 * @Author WKF
 * @Date 2020.10.28 13:43
 */
public class FemaleCow {
    public static int current = 1;
    public static int year = 1;
    public static int[] yearNum;

    public static void calcCowNum(){

        current++;
        if(current <= 4){
            yearNum[3] = yearNum[2] + yearNum[3];
            yearNum[2] = yearNum[1];
            yearNum[1] = yearNum[0];
            yearNum[0] = 1;
        }else {
            yearNum[3] = yearNum[2] + yearNum[3];
            yearNum[2] = yearNum[1];
            yearNum[1] = yearNum[0];
            yearNum[0] = yearNum[3];
        }

        if (current >= year){
            int sum = 0;
            for (int k : yearNum){
                sum = sum + k;
            }
//            System.out.println(Arrays.toString(yearNum));
            System.out.println(sum);
            return;
        }else{
            calcCowNum();
        }

    }


    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        while (scan.hasNextLine()){
            current = 1;
            yearNum = new int[]{0, 0, 0, 1};
            year = scan.nextInt();
            if (year == 0){
                break;
            }else if (year == 1){
                System.out.println(1);
            }else{
                calcCowNum();
            }


        }
    }
}

/*      总   母   小
*   1   1   1
*   2   2   1   1
*   3   3   1   2
*   4   4   1   3
*   5   6   1   4
*   6   9   1+1   5+1
*   7       4
* public static void main(String[] args)
{
Crows cow=new Crows();
int total=cow.birthNum(20);
System.out.println(total);
}
public int birthNum(int year)
{
if(year==1)
return 2;
else if(year==2)
return 3;
else if(year==3)
return 4;
else
return birthNum(year-1)+birthNum(year-3);
}
}

* */