package pers.wkf.week17;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @Description
 * @ClassName WorkC
 * @Author WKF
 * @Date 2020.12.23 15:19
 */
public class WorkC {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length<=0){
            return 0;
        }else{
            //创建total记录累加的值，maxSum是记录最大和
            int total=array[0],maxSum=array[0];
            //需要注意在便利原数组的时候，因为第一个位置的值已经赋给了total了，后面累加的时候就需要从第二个位置开始
            //所以i从1开始，同时也考虑到了，长度为1的情况就直接循环结束了
            //同时也考虑到了即使数组中的值全为负数同样也是适用的，当全为负数的时候total就回肯定比maxSum小
            for(int i=1;i<array.length;i++){
                //从第一个值开始当出现了累加的为正数的时候说明累加是有贡献的
                if(total>=0){
                    total+=array[i];
                }else{
                    //一旦累加小于0直接将之前的放弃掉，从新开始total
                    total=array[i];
                }
                //每一次遍历一个元素的时候，如果出现了 total的值大于最大的值就直接将累加值赋值给maxSum
                if(total>maxSum){
                    maxSum=total;
                }
            }
            return maxSum;
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            System.out.println(FindGreatestSumOfSubArray(a));
/*            int b[]=new int[n];
            b[0]=a[0];
            for(int i=1;i<n;i++){
                if(b[i-1]>0){
                    b[i]=b[i-1]+a[i];
                }else{
                    b[i]=a[i];
                }
            }
            Arrays.sort(b);
            System.out.println(b[n-1]);*/
        }
    }
}

/*
        import java.util.Scanner;
        import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            int b[]=new int[n];
            b[0]=a[0];
            for(int i=1;i<n;i++){
                if(b[i-1]>0){
                    b[i]=b[i-1]+a[i];
                }else{
                    b[i]=a[i];
                }
            }
            Arrays.sort(b);
            System.out.println(b[n-1]);
        }
    }
}*/
