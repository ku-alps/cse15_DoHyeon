package Week_2;
//https://www.acmicpc.net/problem/2840

import java.util.Scanner;

public class Lucky_Wheel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();          // 바퀴의 칸수
        int K = scanner.nextInt();          // 돌리는 횟수
        char[] answer = new char[N];
        int index = 0;
        char tmp;
        for(int i = 0 ; i<K; i++) {
            index = (index + scanner.nextInt()) % N;
            tmp = scanner.next().charAt(0);
            for(int j = 0 ; j<N; j++) {
                if(answer[j] == tmp && j != index) {
                    System.out.println("!");
                    return;
                }
            }
            answer[index] = tmp;
        }
        index += N;
        for(int i = 0; i < N; i++)
            System.out.print(answer[(index-i) % N] == 0 ? '?' : answer[(index-i) % N]);
    }
}
