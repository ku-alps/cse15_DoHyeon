package Week_4;
// https://www.acmicpc.net/problem/7576

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt(), N = scan.nextInt();
        int [][] box = new int[N][M];
        Queue<int[]> ripen = new ArrayDeque<>();                            // BFS 형식 사용
        int zeroCount = 0;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                box[i][j] = scan.nextInt();
                if(box[i][j] == 1) ripen.offer(new int[]{j, i});            // 익은 과일의 좌표만을 저장
                else if(box[i][j] == 0) zeroCount += 1;
            }
        }
        int [] tmp;
        int size = ripen.size();
        while(size != 0) {
            answer += 1;
            for(int i = 0; i<size; i++) {
                tmp = ripen.poll();
                if(tmp[0] > 0)  check(box, tmp[0]-1, tmp[1], ripen);        // Boundary 확인
                if(tmp[0] < M-1)  check(box,tmp[0]+1, tmp[1], ripen);
                if(tmp[1] > 0)  check(box, tmp[0], tmp[1]-1, ripen);
                if(tmp[1] < N-1) check(box, tmp[0], tmp[1]+1, ripen);
            }
            size = ripen.size();
            zeroCount -= size;
        }
        if(zeroCount == 0) System.out.println(answer-1);
        else System.out.println("-1");
    }
    public static void check(int [][] box, int j, int i, Queue<int[]> queue) {
        if(box[i][j] == 0) {
            box[i][j] = 1;
            queue.offer(new int[]{j, i});
        }
    }
}
