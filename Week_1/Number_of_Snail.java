package Week_1;

import java.util.Scanner;

public class Number_of_Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] problems = new int[n];
        for(int i = 0 ; i<n; i++)                       // 스캔
            problems[i] = scanner.nextInt();
        for(int i = 0 ; i < n; i++) {                  // 실제 문제 푼 내용
            System.out.println("#"+(i+1));
            int [][] num = new int[problems[i]+2][problems[i]+2];       // 테두리를 설정함
            int x = 1, y = 1, count = 1;
            for(int j = 0; j<problems[i]+2; j++) {                  // 테두리 역할을 하는 index는 -1로 지정
                num[0][j] = -1;
                num[j][0] = -1;
                num[j][problems[i]+1] = -1;
                num[problems[i]+1][j] = -1;
            }
            boolean x_go = true, y_go = true;
            while(count <= problems[i] * problems[i]) {
                if(x_go && y_go) num[x][y++] = count++;
                else if(x_go && !y_go) num[x++][y] = count++;
                else if(!x_go && !y_go) num[x][y--] = count++;
                else num[x--][y] = count++;
                if(num[x][y] != 0) {
                    if(x_go) {
                        if(y_go) { x++; y--; y_go = !y_go;}
                        else { x--; y--; x_go = !x_go;}
                    }
                    else {
                        if(y_go) { x++; y++; x_go = !x_go;}
                        else { x--; y++; y_go = !y_go;}
                    }
                }
            }
            for(int j = 1 ; j<=problems[i]; j++) {                  // 답출력
                for(int k = 1; k <=problems[i] ; k++) {
                    System.out.print(num[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
