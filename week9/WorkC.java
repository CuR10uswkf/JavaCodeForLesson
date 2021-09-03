package pers.wkf.week9;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkC
 * @Author WKF
 * @Date 2020.10.28 16:43
 */
public class WorkC {
    public static int getAllArea(int lineNum){
        if (lineNum == 1){
            return 2;
        }
        return getAllArea(lineNum-1) + ((lineNum-1)*4+1);
    }
    public static void main(String[] args) {
        int brokenlineNum;
        Scanner scan = new Scanner(System.in);
        int allLine = scan.nextInt();
        int currentLine = 0;
        while (scan.hasNextLine()){
            if (currentLine >= allLine){
                break;
            }
            scan.nextLine();
            currentLine++;
            brokenlineNum = scan.nextInt();
            System.out.println(getAllArea(brokenlineNum));
        }
    }
}
