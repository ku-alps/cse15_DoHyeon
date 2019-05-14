package Week_5;
//https://www.acmicpc.net/problem/3020

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dog_beetle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(str.nextToken());
        int height = Integer.parseInt(str.nextToken());
        int num = 2;
        int min = length/2;
        int [] obstacle = new int[height];
        int [] reversedObstacle = new int[height];
        for(int i =0; i<length/2; i++) {
            obstacle[Integer.parseInt(br.readLine())-1] ++;
            reversedObstacle[Integer.parseInt(br.readLine())-1]++;
        }
        for(int i = height-2; i >= 0; i--) {
            reversedObstacle[i] += reversedObstacle[i + 1];
            obstacle[i] += obstacle[i + 1];
        }
        for(int i = 1; i<height-1; i++) {
            int tmp = obstacle[i] + reversedObstacle[height-i-1];
            if(tmp < min) {
                min = tmp;
                num = 1;
            }
            else if(tmp == min) num += 1;
        }
        br.close();
        System.out.println(min + "\n" +num);
    }
}
