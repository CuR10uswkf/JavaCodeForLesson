package pers.wkf.week17;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkA2
 * @Author WKF
 * @Date 2020.12.23 14:37
 */
public class WorkA2 {
/*    public static int getMax(){

    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseNum = scanner.nextInt();
        while(testCaseNum>0){
            int towerHeight = scanner.nextInt();
            int tower[][] = new int[towerHeight][];
            for (int i=0;i<=towerHeight-1;i++){
                for (int j=0;;j++){
/*                    if (scanner.nextLine()){
                        continue;
                    }else {
                        tower[i][j] = scanner.nextInt();
                    }*/
                }
            }
            System.out.println(tower);
            testCaseNum--;
        }
    }
}
