package pers.wkf.week18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2020.12.30 14:37
 */
public class WorkB {
    public static int yuanshi(String[] studentArray){
        if (Integer.parseInt(studentArray[1]) > 80 && Integer.parseInt(studentArray[5]) >= 1){
            //System.out.println("yuanshi");
            return 8000;
        }else {
            return 0;
        }
    }
    public static int wusi(String[] studentArray){
        if (Integer.parseInt(studentArray[1]) > 85 && Integer.parseInt(studentArray[2]) > 80){
            //System.out.println("wusi");
            return 4000;
        }else {
            return 0;
        }
    }
    public static int goodResult(String[] studentArray){
        if (Integer.parseInt(studentArray[1]) > 90 ){
            //System.out.println("good");
            return 2000;
        }else {
            return 0;
        }
    }
    public static int xibu(String[] studentArray){
        if (Integer.parseInt(studentArray[1]) > 85 &&  studentArray[4].equals(String.valueOf('Y'))){
            //System.out.println("xibu");
            return 1000;
        }else {
            return 0;
        }
    }
    public static int banjigonhxian(String[] studentArray){
        if (Integer.parseInt(studentArray[2]) > 80 &&  studentArray[3].equals(String.valueOf('Y'))){
            //System.out.println("banji");
            return 850;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum = scanner.nextInt();
        scanner.nextLine();
        String[] maxStudent = new String[2];
        int totalMoney = 0;
        while(lineNum>0){
            String studentArray[] = new String[6];
            String student  = scanner.nextLine();
            //System.out.println(student);
            studentArray = student.split(" ");
            //System.out.println(studentArray);
            int sum = 0;
            sum = sum + yuanshi(studentArray) + wusi(studentArray) + goodResult(studentArray) + xibu(studentArray) + banjigonhxian(studentArray);
            //System.out.println(sum);
            if (maxStudent[0] == null){
                maxStudent[0] = studentArray[0];
                maxStudent[1] = String.valueOf(sum);
                totalMoney = totalMoney + sum;
            }else {
                if (sum > Integer.parseInt(maxStudent[1])){
                    maxStudent[0] = studentArray[0];
                    maxStudent[1] = String.valueOf(sum);
                }
                totalMoney = totalMoney + sum;
            }
            lineNum--;
        }
        System.out.println(maxStudent[0]);
        System.out.println(maxStudent[1]);
        System.out.println(totalMoney);
    }
}
