package Week_4;
//https://www.acmicpc.net/problem/2579

import java.util.Scanner;

public class Climb_Stair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] scores = new int[N];
        int [][] array = new int[N][2];
        for(int i = 0 ; i< N; i++) scores[i] = scan.nextInt();
        if(N > 2) {
            array[N-1] = new int[] {scores[N-1], scores[N-1]};
            array[N-2] = new int[] {0, scores[N-1] + scores[N-2]};
            array[N-3] = new int[] {scores[N-1] + scores[N-3], scores[N-1] + scores[N-3]};
            int count = N - 3;
            while (count-- != 0) {
                array[count][0] = (array[count+2][0] > array[count+2][1] ? array[count+2][0] : array[count+2][1]) + scores[count];
                array[count][1] = array[count+1][0] + scores[count];
            }
            array[0][0] = array[0][0] > array[0][1] ? array[0][0] : array[0][1];
            System.out.println(array[0][0] > array[1][1] ? array[0][0] : array[1][1]);
        }
        else if(N == 2) System.out.println(scores[0] + scores[1]);
        else System.out.println(scores[0]);
    }
}
