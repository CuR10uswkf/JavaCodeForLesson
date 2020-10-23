package pers.wkf.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkCBySelf
 * @Author WKF
 * @Date 2020.10.23 14:02
 */
public class Main {

    public static int input_num;    //记录用户输入的第一行，也就是用户要输入几组数据
    public static int success_num = 0;  //从1000-9999可能有不止一个数满足用户输入，这里记录满足用户输入的数的个数
    public static int result = 0;   //这里记录是如果在1000-9999内只有一个数满足用户的输入，就打印出

    /**
     * @Description 这两个数中有几个对应的位置的数字是相同的
     * @Param num_com_position：计算机产生的数；num_per_position：用户输入的数
     * @return  相同位置的个数
     **/
    public static int getSamePositionNum(int num_com_position, int num_per_position) {
        int same_position = 0;
        char com_position_array[] = String.valueOf(num_com_position).toCharArray();
        char per_position_array[] = String.valueOf(num_per_position).toCharArray();
        for (int i = 0; i <= 3; i++) {
            if (com_position_array[i] == per_position_array[i]) {
                same_position++;
            }
        }
        return same_position;
    }

    /**
     * @Description 输入一个数，将其每位上的数字作为元素转化为数组 例：123=》{1,2,3}
     **/
    public static int[] updateNumToArray(int num) {
        int temp[] = new int[10];
        String num_str = String.valueOf(num);
        char temp_nums_str[] = num_str.toCharArray();

        for (int i = 0; i <= 9; i++) {
            temp[i] = 0;
        }
        for (int temp_num_str : temp_nums_str) {
            temp[temp_num_str - 48]++;
        }
        return temp;
    }

    /**
     * @Description
     * @Param   num_com：计算机产生的数字；int num_pers[][]：用户输入的N组数据
     * @return
     **/
    public static void check(int num_com, int num_pers[][]) {
        int num_com_array[] = updateNumToArray(num_com);
        for (int row = 0; row <= input_num-1; row++) {
            int num_per_array[] = updateNumToArray(num_pers[row][0]);    //每一组输入中的第一个数字
            int sum_same_num = 0;
            int sum_same_position = 0;

            for (int i = 0; i <= 9; i++) {
                sum_same_num = sum_same_num + Math.min(num_com_array[i], num_per_array[i]);
            }
            //验证相同数字个数
            if (sum_same_num != num_pers[row][1]) {  //如果当前计算机产生的数字与用户的数字相同数字的个数与用户输入的不一致，说明当前数字不是
                break;
            }
            //验证相同位置
            sum_same_position = getSamePositionNum(num_com, num_pers[row][0]);
            if (sum_same_position != num_pers[row][2]) {
                break;
            }
            if (row == input_num-1){
                success_num++;
                result = num_com;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()){
            success_num = 0;
            input_num = scan.nextInt();
            if (input_num == 0){
                break;
            }
            scan.nextLine();
            int num_pers[][] = new int[input_num][3];
            for (int i = 0; i<=input_num-1;i++) {
                String str_temp[] = scan.nextLine().split(" ");
                for (int j = 0; j <= 2; j++) {
                    num_pers[i][j] = Integer.parseInt(str_temp[j]);
                }
            }

            for (int num_com = 1000; num_com <= 9999; num_com++) {
                 check(num_com, num_pers);
            }

            if (success_num == 1) {
                System.out.println(result);
            }else{
                System.out.println("Not sure");
            }
        }
    }
}
