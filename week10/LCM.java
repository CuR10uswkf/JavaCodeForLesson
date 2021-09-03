package pers.wkf.week10;

import java.util.*;

/**
 * @Description
 * @ClassName LCM
 * @Author WKF
 * @Date 2020.11.04 14:11
 */
public class LCM {
    public static Integer getGcd(Integer a, Integer i) {
        if (i == 0) {
            return a;
        }
        Integer min = Math.min(a, i);
        Integer max = Math.max(a, i);
        return getGcd(min, max % min);
    }

    public static Integer getLcm(Integer a, Integer b) {
        return a / getGcd(a, b) * b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalData = scanner.nextInt();
        while (scanner.hasNextLine()) {
            if (totalData <= 0) {
                break;
            }
            scanner.nextLine();
            int totalNum = scanner.nextInt();
            int nums[] = new int[totalNum];
            for (int i = 0; i <= totalNum - 1; i++) {
                nums[i] = scanner.nextInt();
            }
            int tempLCM = nums[0];
            int length = nums.length;
            if (length == 1) {
                System.out.println(tempLCM);
            } else {
                for (int i = 1; i <= length - 1; i++) {
                    tempLCM = getLcm(tempLCM, nums[i]);
                }
                System.out.println(tempLCM);
            }

/*            List<Integer> nums = new LinkedList<>();
            for (int i = 0; i<=totalNum-1;i++){
                nums.add(i, scanner.nextInt());
            }
            while (nums.size() != 1){
                nums.add(nums.size()-2, getLcm(nums.get(nums.size()-1),nums.get(nums.size()-2)));
                nums = nums.subList(0,nums.size()-2);
                //System.out.println(nums.size());
            }
            System.out.println(nums.get(0));*/

/*            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i<=totalNum-1;i++){
                queue.offer(scanner.nextInt());
            }
            while (queue.size() != 1){
                queue.offer(getLcm(queue.poll(),queue.poll()));
            }
            System.out.println(queue.poll());*/

/*            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i<=totalNum-1;i++){
                stack.push(scanner.nextInt());
            }
            while (stack.size() != 1){
                stack.push(getLcm(stack.pop(),stack.pop()));
            }
            System.out.println(stack.pop());*/

            totalData--;
        }
    }
}
