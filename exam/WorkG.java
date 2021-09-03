package pers.wkf.exam;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkG
 * @Author WKF
 * @Date 2021.01.01 13:46
 */
public class WorkG {
    private static int getCount(String s, String string) {
        int count=0;
        int index=0;
        while((index=s.indexOf(string))!=-1)
        {
            s=s.substring(index+string.length());
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] words = new String[5][4];
        words[0][0] = "qh";
        words[1][0] = "sh";
        words[2][0] = "hl";
        words[3][0] = "xx";
        words[4][0] = "kt";
        int max = -1;
        int maxNum = 0;
        int countSame = 1;
        for (int i = 0; i<=4;i++){
            String s = scanner.nextLine();
            //System.out.println(scanner.nextLine());
            words[i][1] = String.valueOf(getCount(s,"buhuiba"));
            words[i][2] = String.valueOf(getCount(s,"jiuzhe"));
            //System.out.println(words[i][1]);
            //System.out.println(words[i][2]);
            if (maxNum < Integer.parseInt(words[i][1])+Integer.parseInt(words[i][2])){
                max = i;
                countSame=1;
                maxNum = Integer.parseInt(words[i][1])+Integer.parseInt(words[i][2]);
            } else if (maxNum == Integer.parseInt(words[i][1])+Integer.parseInt(words[i][2])){
                countSame++;
            }
        }

        for (int i=0;i<=4;i++){
            System.out.print(words[i][0] + " ");
            System.out.print(words[i][1] + " ");
            System.out.println(words[i][2]);
        }
        if (countSame==1) {
            System.out.println(words[max][0]);
        }else {
            System.out.println("yygqdss");
        }

    }
}
