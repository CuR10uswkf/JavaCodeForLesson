package pers.wkf.week16;

import java.util.*;

/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2020.12.16 13:52
 */

class args {
    public static ArrayList<Integer> dateHasveUsed;
}
public class WorkB {

    public static void descendOrderScore(Map mapSD){
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(mapSD.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                // return ((Integer) o2.getValue() - (Integer) o1.getValue());
                return ((Integer) o1.getKey().compareTo((Integer) o2.getKey())); //根据score排序
            }
        });
/*        for (Map.Entry<Integer, Integer> mapping : infoIds) {
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }*/
        args.dateHasveUsed = new ArrayList<>();
        int sumPunish = 0;
        for (int i=0; i<infoIds.size();i++){
            Map.Entry<Integer, Integer> mapping = infoIds.get(infoIds.size() - i - 1);
            sumPunish = check(mapping.getValue(),mapping.getKey(),sumPunish);
        }
        System.out.println(sumPunish);
    }
    public static int check(int date, int score, int sumPunish){
        if (args.dateHasveUsed.contains(date)){
            // 包含
            if (date == 1){
                sumPunish= sumPunish+score;
                return sumPunish;   //把对应的分数加进去
            }else{
                date = date-1;
                return check( date, score,sumPunish);
            }
        }else{
            args.dateHasveUsed.add(date);
            return sumPunish;
        }
    }
    public static Map getDatesAndScoresMap(ArrayList datesArray, ArrayList scoresArray){
        Map<Integer,Integer> scoreDate = new HashMap<>();
        for (int i=0; i<scoresArray.size();i++){
            scoreDate.put((Integer) scoresArray.get(i),(Integer) datesArray.get(i));
        }
        return scoreDate;
    }
    public static void main(String[] args) {

        ArrayList<Integer> datesArray = new ArrayList<>(Arrays.asList(1, 4, 6, 4, 2, 4, 3));
        ArrayList<Integer> scoresArray = new ArrayList<>(Arrays.asList(3, 2, 1, 7, 6, 5, 4));
        Map<Integer,Integer> mapSD = new HashMap<>();
        mapSD = getDatesAndScoresMap(datesArray, scoresArray);
        descendOrderScore(mapSD);

/*        Scanner scanner = new Scanner(System.in);
        int allGroupNum = scanner.nextInt();
        while (allGroupNum > 0){
            scanner.hasNextLine();
            int num = scanner.nextInt();
            ArrayList<Integer> datesArray = new ArrayList<>();
            for (int i= 0; i<num;i++){
                datesArray.add(scanner.nextInt());
            }
            scanner.hasNextLine();
            ArrayList<Integer> scoresArray = new ArrayList<>();
            for (int i= 0; i<num;i++){
                scoresArray.add(scanner.nextInt());
            }
            System.out.println(datesArray);
            System.out.println(scoresArray);
            allGroupNum--;
        }*/
    }
}
