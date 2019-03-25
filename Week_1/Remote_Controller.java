package Week_1;
// 가장 큰 수와 가장 작은 수를 두 번 검사하고, 100이랑 마지막으로 비교한다.
// 가장 큰 수는 맨 처음 똑같이 나오는 수를 제외하고 가능한 작은 수를 선택
// 가장 작은 수는 맨 처음 똑같이 나오는 수를 제외하고 가능한 큰 수를 선택
// 10000 1 1
// 9999 1 9
import java.util.Scanner;

public class Remote_Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer;
        String N = scan.next();
        int length = N.length();
        int M = scan.nextInt();
        boolean [] broken = {false, false, false, false, false, false, false, false, false, false};
        for(int i = 0; i< M; i++){
            broken[scan.nextInt()] = true;
        }
        StringBuilder hightest= new StringBuilder();
        StringBuffer lowest = new StringBuffer();
        int flag;
        for(int i = 0 ; i<length; i++) {
            if(broken[N.charAt(i)-'0']) {
                flag = findNum(broken, N.charAt(i), true);
                if(flag == -1) ;
            } else hightest.append(N.charAt(i));
        }
    }

    public static int findNum(boolean [] broken, char ch, boolean isHighest) {
        if(isHighest) {         // 가장 높은걸 찾아야 함
            for(int i = Character.getNumericValue(ch) + 1; i< 10; i++) {
                if(!broken[i]) return i;
            }
        }
        else {      // 가장 작은 걸 찾아야 함
            for(int i = Character.getNumericValue(ch) -1; i >= 0; i--) {
                if(!broken[i]) return i;
            }
        }
        return -1;
    }
}