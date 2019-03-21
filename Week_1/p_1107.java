package Week_1;

import java.util.Scanner;

public class p_1107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [] broken = new int[M];
        for(int i = 0 ; i< M; i++)
            broken[i] = scan.nextInt();
        int length = String.valueOf(N).length() - 1;
        int channel = 0;
        int num;
        int distance;

        while(N != 0) {
            num = N / (int)(Math.pow(10, length));
            distance = 10;
            for(int i = 0 ; i < M-1; i++) {
                //if(broken[i] - broken[i+1] != )
                if(broken[i] == num) {}
                else if(broken[i] > num) {
                    channel += num;
                    break;
                }
            }
            N %= (int)Math.pow(10, length--);
            channel *= 10;
        }
    }
}