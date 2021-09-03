package pers.wkf.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkH
 * @Author WKF
 * @Date 2021.01.01 16:01
 */
public class WorkH {
    public static int getMin(){
        for (Object num : nums2) {
            if (min > (Integer) num) {
                //下一个
                continue;
            } else if (min <= (Integer) num && (Integer) num <= max) {
                if (i = 4){
                    //成功
                }else {
                    //下层
                    //
                }
            } else {
                break;  //不行了
            }
        }
    }
    public static void main(String[] args) {
        ArrayList nums1 = new ArrayList(Collections.singleton(new int[]{1, 2, 3, 4, 5}));
        ArrayList nums2 = new ArrayList(Collections.singleton(new int[]{3, 4, 6, 3, 4}));
        ArrayList nums3 = new ArrayList(Collections.singleton(new int[]{3, 4, 5, 6, 7}));
        ArrayList nums4 = new ArrayList(Collections.singleton(new int[]{7, 1, 8, 6, 11}));
        nums1.sort(Comparator.naturalOrder());
        nums2.sort(Comparator.naturalOrder());
        nums3.sort(Comparator.naturalOrder());
        nums4.sort(Comparator.naturalOrder());

        int max;
        int min;
        for (Object num:nums1){
            max = (Integer) num + 2;
            if ((Integer) num-2<0){
                min = 0;
            }else {
                min = (Integer) num-2;
            }
            getMin()
        }

    }
}
