package Week_3;
import java.util.Scanner;
// https://www.acmicpc.net/problem/9012
public class Parentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n; i++) {
            int check = 0;
            StringBuilder string = new StringBuilder(scan.next());
            for(int j = 0 ; j<string.length(); j++){
                if(string.charAt(j) == '(') check += 1;
                else check -= 1;
                if(check < 0) break;
            }
            if(check == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
// 괄호의 규칙의 경우
// '(' 열림 괄호와 ')' 닫힘 괄호의 갯수가 같아야 한다는 조건과
// 항상 열림 괄호가 먼저 생기고 나중에 닫힘 괄호가 생겨야 한다는 조건이 있습니다.
// 이를 활용하여 해결할 수 있습니다.