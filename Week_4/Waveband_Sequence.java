package Week_4;

import java.util.Scanner;

public class Waveband_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] base = new int[] {1,1,1,2,2};
        long [] array;
        int T = scan.nextInt();
        int [] N = new int[T];
        int max = 0;
        for(int i = 0 ; i<T; i++) {
            N[i] = scan.nextInt();
            max = max > N[i] ? max : N[i];
        }
        array = new long[max];
        for(int i = 0; i<max; i++) {
            if(i >= 5) array[i] = array[i-1] + array[i-5];
            else array[i] = base[i];
        }
        for(int i = 0; i<T; i++) {
            System.out.println(array[N[i]-1]);
        }
    }
}

