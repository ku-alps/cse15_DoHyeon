package Week_5;
// https://www.acmicpc.net/problem/11399

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        StringTokenizer str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int [] person = new int[N];
        str = new StringTokenizer(br.readLine());
        for(int i =0  ; i< N; i++) person[i] = Integer.parseInt(str.nextToken());
        Arrays.sort(person);
        for(int i = 0 ; i < N-1; i++) {
            answer += person[i];
            person[i+1] += person[i];
        }
        System.out.println(answer + person[N-1]);
    }
}
