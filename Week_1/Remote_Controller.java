package Week_1;
// 가장 큰 수와 가장 작은 수를 두 번 검사하고, 100이랑 마지막으로 비교한다.
// 가장 큰 수는 맨 처음 똑같이 나오는 수를 제외하고 가능한 작은 수를 선택
// 가장 작은 수는 맨 처음 똑같이 나오는 수를 제외하고 가능한 큰 수를 선택
// 10000 1 1
// 9999 1 9
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Remote_Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        String N = scan.next();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int length = N.length();
        int [] num = new int[length];
        for(int i = 0 ; i<length; i++)
            num[i] = N.charAt(i)-'0';
        int M = scan.nextInt();
        boolean [] broken = {false, false, false, false, false, false, false, false, false, false};
        for(int i = 0; i< M; i++)
            broken[scan.nextInt()] = true;
        for(int i = 0 ; i<10; i++)
            if(!broken[i]) arrayList.add(i);            // Array List에 가능한 숫자를 저장하는 과정

        Stack<Integer> stack = new Stack<>();
        Iterator<Integer> iter = arrayList.iterator();
        for(int i = 0 ; i<length; i++) {                // find Highest
            if(!broken[num[i]]) stack.push(num[i]);
            else {
                int tmp = stackAddIndex(stack.pop(), iter, true);
                if(tmp == -1) {          // 1넣기
                    if(stack.isEmpty()) {
                        length++;
                        stack.push(arrayList.get(0) != 0 ? arrayList.get(0) : arrayList.get(1));
                    }
                    else stack.push(stack.pop()+1);
                }
                else stack.push(tmp);
            }
        }
        for(int i = stack.size(); i < length; i++)
            answer = (answer * 10) + arrayList.get(0);
        for(int i = 0; i<stack.size(); i++)
            answer = (answer * 10) + arrayList.get(0);
        while(stack.size() != length)
            stack.push(arrayList.get(0));

    }
    private static int stackAddIndex(int pop, Iterator<Integer> iter, boolean ishigh){
        if(ishigh) {
            while (iter.hasNext()) {
                if (pop < iter.next()) return pop;               // 바꾸기 성공
            }
        }
        else {
            while(iter.hasNext()) {
                if(pop > iter.next()) return pop;
            }
        }
        return -1;    // 앞자리 바꾸기
    }
    // 가장 큰수는 맨앞에 0을 붙이고 시작한다 => 크기는 1부터 length까지 포함
    // 만약 큰 수로 단위가 하나 올라가면 모든 숫자는 가장 작은수로만 구성되면 된다.
    // 만약 중간에서 단위가 올라 모든 수가 영향을 받는다면...?
    // 8889  1  9 -> 10000,  88891 1 9 -> 100000
    // 모든수를 확인하는 메소드 하나 필요하고 반환 값을 단위로 설정
    // 특정 자리 수에서 조건을 걸어서 단위수가 올라가면 앞에 꺼를 한 개 올려주고 다시 검사
    // 가장 작은 수는 만약 맨앞자리가 0이 되면 제거한다.
    // 만약 작은 수가 단위가 떨어지면 모든 숫자는 가장 큰수로 구성하면 된다.
    // ArrayList 로 있는 숫자들저장...? 만약 없으면 다음꺼 다음꺼... 만약 끝까지 도달하면...
    // 답을 저장할 때는 맨 앞부터 Stack에서 확인하면서 저장
    // 하나 올리면서 확인할때 하나씩 뽑으면서 확인
    // 단위가 바뀌면 가장 작은 수는 가능한 가장 큰수만 넣으면 됨
    // 가장 큰 수는 가능한 가장 작은 수만 넣으면 됨
}