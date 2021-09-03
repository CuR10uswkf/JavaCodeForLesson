package pers.wkf.week15;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Description
 * @ClassName WorkA
 * @Author WKF
 * @Date 2020.12.09 14:07
 */
class road {
    int begin;
    int end;
    int weight;

    public road(int begin, int end, int weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        road o = (road) obj;
        return this.begin == o.begin && this.end == o.end;
    }
}

public class WorkA {

    static int[] tree;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0)
                break;
            int minWeight = 0;
            int m = scanner.nextInt();
            tree = new int[m + 1];
            List<road> list = new ArrayList<>();
            for (int i = 0; i < tree.length; i++)
                tree[i] = -1;

            for (int i = 0; i < n; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();
                int weight = scanner.nextInt();
                road r = new road(begin, end, weight);
                if (!list.contains(r))
                    list.add(r);
                else {
                    int index = list.indexOf(r);
                    if (weight < list.get(index).weight)
                        list.get(index).weight = weight;
                }
            }
            list.sort(new Comparator<road>() {

                @Override
                public int compare(road o1, road o2) {
                    return o1.weight <= o2.weight ? -1 : 1;
                }
            });
            for (road r : list) {
                int beginRoot = findRoot(r.begin);
                int endRoot = findRoot(r.end);
                if (beginRoot != endRoot) {
                    tree[beginRoot] = endRoot;
                    minWeight += r.weight;
                }
            }
            int connect = 0;
            for (int i = 1; i <= m; i++)
                if (tree[i] == -1)
                    connect++;
            if (connect > 1)
                System.out.println("?");
            else
                System.out.println(minWeight);
        }
        scanner.close();
    }

    static int findRoot(int x) {
        if (tree[x] == -1)
            return x;
        int root = findRoot(tree[x]);
        tree[x] = root;
        return root;
    }

}