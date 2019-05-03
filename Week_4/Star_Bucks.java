package Week_4;
// https://swexpertacademy.com/main/code/userProblem/userProblemDetail.do?contestProbId=AWpYBKT6mUYDFAQi
import java.util.Scanner;

public class Star_Bucks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0 ; i<T; i++) {
            int N = scan.nextInt(), M = scan.nextInt(), K = scan.nextInt();
            int [] coffee = new int[M];
            int sum = 0;
            for(int j = 0 ; j< N; j++) coffee[scan.nextInt()-1] += 1;
            for(int j = 0 ; j<M; j++) sum += (coffee[j] * (scan.nextInt()));
            if(K < sum) System.out.println("#case N");
            else System.out.println("#case Y");
        }
    }
}
