package Week_1;

import java.util.Scanner;

public class p_1024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();
        int sum = 0;
        for(int i = 1 ; i < L; i++) sum += i;           // 0부터 L-1 까지의 합
        while(L <= 100) {
            if(sum > N) L = 101;
            else if((N - sum) % L == 0) break;
            sum += L++;
        }
        if(L > 100) System.out.println("-1");
        else {
            sum  = (N - sum) / L;
            for(int i = 0; i < L; i++)
                System.out.print(sum + i + " ");
        }
    }
}