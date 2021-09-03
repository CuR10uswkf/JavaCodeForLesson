package pers.wkf.week14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @Description
 * @ClassName WorkB
 * @Author WKF
 * @Date 2020.12.02 14:09
 */
/*
public class WorkB {
    public static int getNeedNum(int numOfTown, int numOfRoad){
        if((numOfTown - 1 - numOfRoad) > 0){
            return numOfTown - 1 - numOfRoad;
        }else{
            return 0;
        }
    }
    public static int checkSame(int[][] roads){
        int count=0;
        for (int i=0;i<=roads.length-1;i++){
            int[] temp = roads[i];
            for (int j=i+1; j<=roads.length-1;j++){
                if ((roads[j][0] == temp[0] && roads[j][1] == temp[1]) || (roads[j][0] == temp[1] && roads[j][1] == temp[0])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isHaveLoop(int[][] graph, int n) {

        //习惯上转换成临接表的形式
        List<Integer>[] adj = new ArrayList[n];
        for (int[] edg : graph) {
            int node1 = edg[0];
            int node2 = edg[1];
            if (adj[node1] == null) {
                adj[node1] = new ArrayList<>();
            }
            if (adj[node2] == null) {
                adj[node2] = new ArrayList<>();
            }
            adj[node1].add(node2);
            adj[node2].add(node1);
        }
        boolean[] visited = new boolean[n];//定义一个节点状态数组  判断是否访问过
        int[] a = {0};
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {//如果没有进行访问  则进行深度优先搜索回溯
                dfsCycle(adj, i, -1, visited, a);//引用传递  函数内部修改值后退出函数可见
//                System.out.println(a[0]);
                if (a[0] == 1) {//只要有一次i循环时存在环路那就直接提前返回，说明存在环
                    return true;
                }
            }
        }
        return a[0] == 1;
    }
    private void dfsCycle(List<Integer>[] adj, int current, int parent, boolean[] visited, int[] flag) {
        visited[current] = true;//首先 访问当前节点   并进行标记
        List<Integer> list = adj[current];  //获取到当前节点能够到达的所有节点
        for (Integer can : list) {
            if (visited[can] == false) {//如果节点没有被访问过
                dfsCycle(adj, can, current, visited, flag);//当前节点就是父节点，循环的节点就是子节点
            } else if (can != parent) {// 在节点被访问过的情况下 如果该节点不等于父节点  ，说明有环
                flag[0] = 1;
            }
            //循环节点等于父节点的情况直接跳过，不用处理
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int numOfTown = scanner.nextInt();
            if (numOfTown == 0){
                break;
            }
            int numOfRoad = scanner.nextInt();
            int[][] roads = new int[numOfRoad][2];

            for (int i=0; i<=numOfRoad-1; i++){
                scanner.nextLine();
                roads[i][0] = scanner.nextInt();
                roads[i][1] = scanner.nextInt();

                if (isHaveLoop(roads,numOfTown)){
                    roads[i][0]=0;
                    roads[i][1]=0;
                }
                //判断加上去就产生环，就numOfRoad-1
            }
            int numOfRoadValid = numOfRoad-checkSame(roads);
            //System.out.println(numOfRoadValid);
            //check(loop);
            System.out.println(getNeedNum(numOfTown,numOfRoadValid));
        }
    }
}
*/
import java.util.Scanner;
import java.util.TreeSet;

public class WorkB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int townNum = scanner.nextInt();
            if (townNum == 0){
                break;
            }
            int pathNum = scanner.nextInt();
            UnionFind unionFind = new UnionFind(townNum+1);
            for (int i = 0; i < pathNum; i++) {
                int town1 = scanner.nextInt();
                int town2 = scanner.nextInt();
                unionFind.union(town1,town2);
            }
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 1; i <=townNum; i++) {
                set.add(unionFind.find(i));
            }
            System.out.println(set.size()-1);
        }
    }
    public static class UnionFind {

        private int[] id;

        public UnionFind(int N) {
            //构造函数，初始化数组[0,1,2,3,4]
            id = new int[N];
            for(int i = 0; i < N; i++) id[i] = i;
        }
        //返回p的父节点
        public int find(int p) {
            return id[p];
        }

        public void union(int p, int q){
            int pRoot = find(p);
            int qRoot = find(q);
            if(pRoot == qRoot) return;
            for(int i = 0; i < id.length; i++)
                if(id[i] == pRoot)  id[i] = qRoot;
        }
    }
}
