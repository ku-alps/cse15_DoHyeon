package First_Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p_1463 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int answer = 0;
        boolean isPass = true;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(num);
        while(isPass) {
            int length = queue.size();
            for(int i = 0 ; i<length; i++) {
                num = queue.poll();
                if(num == 1) {
                    isPass = false;
                    break;
                }
                if(num % 3 == 0) queue.offer(num/3);
                if(num % 2 == 0) queue.offer(num/2);
                queue.offer(num-1);
            }
            answer += 1;
        }
        System.out.println(answer-1);
    }
}
class p_1463_v2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];

        dp[0]=dp[1]=0;

        for(int i=2;i<=n;i++) {
            dp[i]=dp[i-1]+1;
            if(i%2==0) {
                dp[i]=Math.min(dp[i], dp[i/2]+1);
            }
            if(i%3==0) {
                dp[i]=Math.min(dp[i], dp[i/3]+1);
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}