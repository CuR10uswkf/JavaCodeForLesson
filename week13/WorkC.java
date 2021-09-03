package pers.wkf.week13;
import pers.wkf.week13.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkC
 * @Author WKF
 * @Date 2020.11.25 13:52
 */
public class WorkC {
    public static TreeNode updateToTree(LinkedList nums){
        TreeNode root = createNode(nums, 1);
        return root;
    }

    public static TreeNode createNode(LinkedList nums,int index){
        if (index <= nums.size()/2){
            int value = (int) nums.get(index-1);
            if (value != 0){
                TreeNode treenode = new TreeNode(index);
                treenode.left = createNode(nums, (index-1)*2+1);
                treenode.right = createNode(nums, (index-1)*2+2);
                return treenode;
            }
        }
        return null;
    }

    public static ArrayList changeArray(LinkedList nums, int count){
        ArrayList temp  = new ArrayList(count*2);
        for (int i = 1; i<=count; i++) {
            temp.add(i);
            int n = i;  //n=1
            temp.add(2 * n, (int)nums.get((n - 1) * 2));
            temp.add(2 * n + 1, (int)nums.get((n - 1) * 2 + 1));
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNode = scanner.nextInt();
        int count = 0;
        TreeNode root = new TreeNode();
        LinkedList nums = new LinkedList();

        while (true){
            scanner.nextLine();
            count++;
            int leftVal = scanner.nextInt();
            int rightval = scanner.nextInt();
            nums.add(leftVal);
            nums.add(rightval);
            //createNode(root,leftVal,rightval);

            if (count >= numOfNode){
                //构造树
                break;
            }
        }
        System.out.println(changeArray(nums,count));
//        System.out.println(nums);
    }
}
