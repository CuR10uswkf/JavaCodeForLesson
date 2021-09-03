package pers.wkf.week13;

import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2020.11.25 15:32
 */
public class WorkB {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder pre = new StringBuilder();
        StringBuilder mid = new StringBuilder();

            scanner.nextLine();
            for (int i=1; i<=num; i++){
                int tempNum = scanner.nextInt();
                pre.append(tempNum);
            }
            scanner.nextLine();
            for (int i=1; i<=num; i++){
                int tempNum = scanner.nextInt();
                mid.append(tempNum);
            }
/*        System.out.println(pre.toString());
        System.out.println(mid.toString());*/

        String s = postOrder(pre.toString(),mid.toString());
        char te[] = s.toCharArray();
        StringBuilder a = new StringBuilder();
        for(int i = 0; i<=te.length-1; i++){
            a.append(te[i]);
            a.append(" ");
        }
        String str = a.toString();
        System.out.println(str.substring(0,str.length()-1));
    }
    private static String postOrder(String pre, String mid) throws Exception{
        if(pre.length() == 1)
            return pre;
        else if(pre.length() == 0)
            return "";
        int m = mid.indexOf(pre.charAt(0));
        return postOrder(pre.substring(1,m+1 ),mid.substring(0, m))
                + postOrder(pre.substring(m+1),mid.substring(m+1))
                + pre.charAt(0);
    }
}
