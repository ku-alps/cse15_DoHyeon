package Week_3;

import java.util.Arrays;
import java.util.Scanner;
// https://codeforces.com/problemset/problem/189/A

public class Cut_Ribbon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pieces[] = new int[3];
        for (int i = 0; i < 3; i++) pieces[i] = scan.nextInt();
        int tmpAnswer;
        int answer = 0;
        Arrays.sort(pieces);
        for(int i = 0 ; i<3; i++) {
            tmpAnswer = Math.floorDiv(n, pieces[i]);
            int tmp = n - (pieces[i] * tmpAnswer);
            while (true) {
                if (tmp % pieces[(i+1)%3] == 0) {
                    tmpAnswer += (tmp / pieces[(i+1)%3]);
                    break;
                }
                else if (tmp % pieces[(i+2)%3] == 0) {
                    tmpAnswer += (tmp / pieces[(i + 2) % 3]);
                    break;
                }
                else if(tmp % (pieces[(i+1)%3] + pieces[(i+2)%3]) == 0) {
                    tmpAnswer += (tmp / (pieces[(i+1)%3] + pieces[(i+2)%3])) * 2;
                    break;
                }
                else {
                    tmp += pieces[i];
                    tmpAnswer -= 1;
                }
                if(tmp > n) {
                    tmpAnswer = 0;
                    break;
                }
            }
            answer = (answer < tmpAnswer) || (answer == 0) ? tmpAnswer : answer;
        }
        System.out.println(answer);
    }
}
