package Week_2;

import java.util.Scanner;

public class Tiling_2n_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] answer = new int[N+1];
        for(int i = 0 ; i<=N; i++) {
            if(i == 0) answer[i] = 0;
            else if(i == 1) answer[i] = 1;
            else if(i == 2) answer[i] = 3;
            else answer[i] = (answer[i-2] * 2 + answer[i-1]) % 10007;
        }
        System.out.println(answer[N]);
    }
}
/*
   아이디어 도출과정은 다음과 같습니다.
   처음에는 콤비네이션으로 계산해서 해결하려고 했고, 규칙성은 찾았으나
   계산 자체의 숫자가 기하급수적으로 커지고 매번 나머지 계산을 통해
   시간상의 문제가 생겨 그 방법 대신 직접 계산해보면서 규칙성을 찾아보니
   다음과 같은 식을 얻을 수 있었습니다. K = (K-1) + ((K-2) * 2)
 */