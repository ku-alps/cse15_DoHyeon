package Week_3;

import java.util.PriorityQueue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/15686
public class Chicken_Delivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int chickenLimit = scan.nextInt();
        int chickenExist = 0;
        int [][] field = new int[n][n];
        int [][] chickenLocation;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int tmp = 0;
        for(int i = 0 ; i <n; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = scan.nextInt();
                if(field[i][j] == 2) chickenExist += 1;
            }
        }
    }
}
