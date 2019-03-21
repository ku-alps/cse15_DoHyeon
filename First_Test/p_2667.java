package First_Test;

import java.util.Scanner;

public class p_2667 {
    public static void main(String[] args) {
        p_2667 p = new p_2667();
    }
    private p_2667() {
        solution();
    }
    private void solution() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int count = 1;
        int [][] map = new int[size][size];
        for(int i =0  ; i<size; i++) {
            String a = scan.next();
            for(int j = 0; j<size; j++) {
                map[i][j] = Character.getNumericValue(a.charAt(j));
            }
        }
        for(int j = 0 ; j<size; j++) {
            for(int i = 0; i<size; i++) {
                if(map[i][j] == 0) ;
                else if(map[i][j] == 1) {
                    if (i != 0)
                        if (map[i - 1][j] != 0) {
                            map[i][j] = map[i][j] > map[i - 1][j] ? map[i][j] : map[i-1][j];
                        }
                    if (j != 0)
                        if (map[i][j - 1] != 0) {
                            map[i][j] = map[i][j] > map[i][j - 1] ? map[i][j] : map[i][j-1];
                        }
                    if (i != size - 1)
                        if (map[i + 1][j] != 0) {
                            map[i][j] = map[i][j] > map[i + 1][j] ? map[i][j] : map[i+1][j];
                        }
                    if (j != size - 1)
                        if (map[i][j + 1] != 0) {
                            map[i][j] = map[i][j] > map[i][j + 1] ? map[i][j] : map[i][j+1];
                        }
                }
                if(map[i][j] == 1) map[i][j] = ++count;
            }
        }
        for(int i =0  ; i<size; i++) {
            for(int j = 0; j<size; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        int [] house = new int[count-1];
        for(int i = 0 ; i<size; i++) {
            for(int j = 0 ; j<size; j++) {
                if(map[i][j] == 0) ;
                else house[map[i][j]-2] += 1;
            }
        }
        System.out.println(house.length);
        for(int i : house) System.out.println(i);
    }
}
