package pers.wkf.exam;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkI
 * @Author WKF
 * @Date 2021.01.01 15:28
 */
public class WorkI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = x;
            int z = x;
            int[][] m1 = new int[x][y];
            int[][] m2 = new int[y][z];
            int[][] r = new int[x][z];
            for(int i=0; i<x; i++) {
                for(int j=0; j<y; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<y; i++) {
                for(int j=0; j<z; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<x; i++) {
                for(int j=0; j<z; j++) {
                    for(int k=0; k<y; k++) {
                        r[i][j] = r[i][j]+m1[i][k]*m2[k][j];
                    }
                }
            }
            for(int i=0; i<x; i++) {
                for(int j=0; j<z; j++) {
                    System.out.print(r[i][j] + " ");
                }
                System.out.println();
            }
        }
        /*
        Scanner scanner = new Scanner(System.in);
        int MartixAspect = scanner.nextInt();
        scanner.nextLine();
        double[][] array01 = new double[MartixAspect][MartixAspect];
        double[][] array02 = new double[MartixAspect][MartixAspect];

        for (int i = 0; i<=MartixAspect-1;i++){
            int num = scanner.nextInt();
            array01[i][0] = num;
            int num2 = scanner.nextInt();
            array01[i][1] = num2;
            scanner.nextLine();
        }
        scanner.nextLine();
        for (int i = 0; i<=MartixAspect-1;i++){
            array02[i][0] = scanner.nextInt();
            array02[i][1] = scanner.nextInt();
            scanner.nextLine();
        }

        double [][] resultMatrix = new double[array01.length][array02[0].length];
        for (int i = 0 ; i < resultMatrix.length ; i++ ){
            for(int j = 0 ; j < resultMatrix[0].length ; j++ ){//正好为矩阵大小，保证了每个元素都被赋值
                for (int num = 0 ; num < array02.length ; num++){
                    resultMatrix[i][j] = resultMatrix[i][j] + array01[i][num]*array02[num][j];
                }
            }
        }

        for (int i = 0 ; i < resultMatrix.length ; i++ ){
            for(int j = 0 ; j < resultMatrix[0].length ; j++ ){//正好为矩阵大小，保证了每个元素都被赋值
                System.err.print((int)resultMatrix[i][j] + " ");
                //System.err.print(resultMatrix[i][j]);
            }
            System.out.println();
        }
        */
    }
}
