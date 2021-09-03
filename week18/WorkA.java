package pers.wkf.week18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkA
 * @Author WKF
 * @Date 2020.12.30 13:37
 */
public class WorkA {
    public static int getDouble(ArrayList numsArray, int count){
        for (int i = 0; i<=numsArray.size()-1; i++) {
            if (numsArray.contains((int)numsArray.get(i)*2)){
                //System.out.println((int)numsArray.get(i));
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList numsArray = new ArrayList();
        int count = 0;
        while (true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }else {
                numsArray.add(num);
            }
        }
        numsArray.sort(Comparator.naturalOrder());
        System.out.println(getDouble(numsArray,count));
    }
}