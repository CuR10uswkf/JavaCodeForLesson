package pers.wkf.week18;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkH
 * @Author WKF
 * @Date 2020.12.30 15:34
 */
public class WorkH {
    public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
         int n=scan.nextInt();
         int [][]Data=new int[n][5];
         for(int i=0;i<n;i++){
              for(int j=0;j<5;j++){
                 Data[i][j]=scan.nextInt();
             }
         }
         scan.close();

         int []days=new int[n];
         for(int i=0;i<n;i++){
             for(int k=Data[i][0]+1;k<Data[i][3];k++){
                 days[i]+=howManyDays(k);
             }
             if(Data[i][0]==Data[i][3]){
                 days[i]=Data[i][4]-Data[i][1];
             }//别忘记考虑起始月和结束月同月份的情况
             else{
                 days[i]+=(howManyDays(Data[i][0])-Data[i][1]);
                 days[i]+=Data[i][4];
             }
         }

         int []amount=new int[n];
         for(int i=0;i<n;i++){
             amount[i]=Data[i][2];
             for(int k=0;k<days[i];k++){
                 amount[i]+=Data[i][2];
             }
         }

         for(int i=0;i<n;i++){
                 System.out.println(amount[i]);
         }

     }

     static int howManyDays(int month){
         if(1<=month&&month<=12){
             switch(month){
             case 1:
             case 3:
             case 5:
             case 7:
             case 9:
             case 11:
                 return 31;
             case 2:
                 return 28;
             case 4:
             case 6:
             case 8:
             case 10:
             case 12:
                 return 30;
             }
         }
         return 0;
     }
}
