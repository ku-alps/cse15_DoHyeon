package First_Test;

import java.util.Scanner;

public class p_1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [][] house = new int[num][3];
        for(int i =0; i < num; i++) {
            for(int j = 0 ; j<3; j++) {
                house[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i<num-1; i++) {
            house[i+1][0] += Math.min(house[i][1], house[i][2]);
            house[i+1][1] += Math.min(house[i][0], house[i][2]);
            house[i+1][2] += Math.min(house[i][0], house[i][1]);
        }
        System.out.println(Math.min(house[num-1][0], Math.min(house[num-1][1], house[num-1][2])));
    }
}
