package Week_5;
// https://www.acmicpc.net/problem/9095

import java.io.*;

public class Plus_1_2_3  {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [] answer = new int[12];
        answer[0] = 1;
        for(int i = 1; i <= 10; i++) {
            answer[i] += answer[i - 1];
            if (i > 1) answer[i] += answer [i - 2];
            if (i > 2) answer[i] += answer [i - 3];
        }
        for(int i = 0 ; i < N; i++) {
            bw.write(answer[Integer.parseInt(br.readLine())]+ "\n");
        }
        br.close();
        bw.close();
    }
}
