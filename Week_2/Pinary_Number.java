package Week_2;
// https://www.acmicpc.net/problem/2193
import java.util.Scanner;

public class Pinary_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long index_n1 = 1;                          // 입력 값이 90이 넘어갈 경우 long 자료형 선언해야 overflow가 일어나지 않습니다
        long index_n2 = 1;
        for(int i = 1; i<= (N-1)/2; i++) {          // 규칙성이 존재합니다.
            index_n1 += index_n2;
            index_n2 += index_n1;
        }
        System.out.println(N % 2 == 1 ? index_n1 : index_n2);       // N이 홀수일 경우 index_n1, 짝수일 경우 index_n2
    }
}
