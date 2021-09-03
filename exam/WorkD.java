package pers.wkf.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkD
 * @Author WKF
 * @Date 2021.01.01 13:08
 */
public class WorkD {
/*
    public static long calc(long a, int xiabiao,int[][] sub){
        if(sub[xiabiao][2]-sub[xiabiao][0] >= a*sub[xiabiao][1]){
            return a*sub[xiabiao][1];
        }else {
            sub[xiabiao][2]-sub[xiabiao][0] >=
        }
    }
    */

    public  static long calc2 (long needScore, int xiabiaos[][],int k, int[][] sub){
        if (needScore > sub[xiabiaos[k][1]][2]-sub[xiabiaos[k][1]][0]){
            //(sub[xiabiaos[k][1]][2]-sub[xiabiaos[k][1]][0])*sub[xiabiaos[k][1]][1];
            needScore = needScore-(sub[xiabiaos[k][1]][2]-sub[xiabiaos[k][1]][0]);
            return (sub[xiabiaos[k][1]][2]-sub[xiabiaos[k][1]][0])*sub[xiabiaos[k][1]][1] + calc2(needScore,xiabiaos,k+1,sub);
        }else {
            return needScore*sub[xiabiaos[k][1]][1];
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subNum = scanner.nextInt();
        int standard = scanner.nextInt();
        int[][] sub = new int[subNum][3];
        int subCur = 0;
        int nowScore = 0;
        long min = Long.MAX_VALUE;
        int xiabiao = -1;
        //int[] xiabiaos = new int[subCur];
        int[][] ts_id = new int[subNum][2];

        //long maxScore;
        while (subCur<=subNum-1){
            for (int i=0;i<=2;i++){
                sub[subCur][i] = scanner.nextInt();
            }
            nowScore=nowScore+sub[subCur][0];
            if (min > sub[subCur][1]){
                xiabiao = subCur;
            }
            ts_id[subCur][0] = sub[subCur][1];
            ts_id[subCur][1] = subCur;
            subCur++;
        }
        long needScore = standard-nowScore;


        Arrays.sort(ts_id,new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
/*        System.out.println(Arrays.toString(ts_id[0]));
        System.out.println(Arrays.toString(ts_id[1]));*/
        long result = calc2(needScore, ts_id,0, sub);

        System.out.println(result);
    }
}
