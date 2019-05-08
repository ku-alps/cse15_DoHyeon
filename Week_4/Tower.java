package Week_4;
// https://www.acmicpc.net/problem/2493

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tower {
    public static void main(String[] args) throws Exception{
        StringTokenizer stk;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<int[]> tower = new Stack<>();
        int [] input;
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++) {
            input = new int[] {Integer.parseInt(stk.nextToken()), i};
            while(!tower.isEmpty()) {
                if(tower.peek()[0] >= input[0]) break;
                else tower.pop();
            }
            if(tower.isEmpty()) bw.write("0 ");
            else bw.write(tower.peek()[1] + 1 + " ");
            tower.push(input);
        }
        br.close();
        bw.close();
    }
}