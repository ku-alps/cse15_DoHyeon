package Week_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Watching_Programming_Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int case_num = scan.nextInt();

        for(int i = 1; i<= case_num; i++) {
            System.out.print("#" + i + " ");
            int N = scan.nextInt();
            int K = scan.nextInt();
            double answer = 0;
            Integer[] course = new Integer[N];
            for(int j = 0 ; j< N; j++)
                course[j] = scan.nextInt();
            Arrays.sort(course, Collections.reverseOrder());        // 내림차순으로 정렬
            for(int k = 0 ; k < K; k++)
                answer += course[k] * Math.pow(0.5, k+1);
            System.out.println(answer);
        }
    }
}
/* 기본적인 아이디어는 다음과 같습니다.
*  만약 모든 강의를 들을 수 없다면 가장 수준이
*  높은 강의가 큰 수로 들어오는 것이 좋은 것으로 판단했습니다.
*  수준이 높은 강의부터 내림차순으로 정리하여서
*  앞에서 K 번째인 강의가 가장 먼저들어오고 앞으로 오면서
*  K-1번째, K-2번째... 1번째 순서로 듣는다고 생각했을 때
*  등비수열 공식이 적용됩니다!*/
