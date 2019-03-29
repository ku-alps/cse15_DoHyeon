package Week_1;

import java.util.LinkedList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11054
public class Longest_Bitonic_Section_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int [] num = new int[length];
        for(int i = 0 ; i < length; i++) num[i] = scan.nextInt();

        LinkedList<Integer> increase = new LinkedList<>();
        LinkedList<Integer> decrease = new LinkedList<>();

        for(int i = 0 ; i<length; i++) {
            if(increase.isEmpty()) increase.add(num[i]);
            else if(decrease.isEmpty()) decrease.add(num[length-i-1]);
            else {
                if(increase.getLast() > num[i]) increase.removeLast();
                if(increase.getLast() != num[i]) increase.addLast(num[i]);
            }
        }
        for(int i = length-1; i >= 0; i--) {
                if(decrease.getLast() > num[i]) decrease.removeLast();
                if(increase.getLast() != num[i]) increase.addLast(num[i]);
        }
        int collaboration = 0;
        int largest = 0;
    }
}
