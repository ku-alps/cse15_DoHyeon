package Week_3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1158
public class Josephus_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1 ; i <= N; i++) queue.offer(i);
        System.out.print("<");
        for(int  i = 0 ; i< N; i++) {
            int count = 1;
            while(count++ != K) {
                queue.offer(queue.poll());
            }
            if(i < N-1) System.out.print(queue.poll()+ ", ");
            else System.out.print(queue.poll());
        }
        System.out.print(">");
    }
}
// Queue의 FIFO을 사용하여 K번째 숫자에 도달하였을 때 뽑아서 출력하고 아닐 경우 Queue의 맨 뒤로 돌려줍니다.