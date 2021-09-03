package pers.wkf.week18;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkC
 * @Author WKF
 * @Date 2020.12.30 15:28
 */
public class WorkC {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int L=in.nextInt();
        int M=in.nextInt();
        int count=L+1;
        boolean c[]=new boolean[L+5];
        int a[]=new int[M+1];
        int b[]=new int[M+1];
        for(int i=0;i<M;i++){
            a[i+1]=in.nextInt();
            b[i+1]=in.nextInt();
        }
        for(int i=1;i<=M;i++){
            for(int j=a[i];j<=b[i];j++){
                if(c[j]==false){
                    c[j]=true;
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
