package Week_1;

// https://programmers.co.kr/learn/courses/30/lessons/42883?language=java
public class Make_Biggest_Num {
    public static void main(String[] args) {
        Make_Biggest_Num MBN = new Make_Biggest_Num();
    }
    private Make_Biggest_Num() {
        System.out.println(solution("1924", 2));
        System.out.println(solution("12341234", 3));
        System.out.println(solution("417725841", 4));

    }
    public String solution(String number, int k) {
        int length = number.length();
        int final_length = length - k;
        if(length - k == 1) System.out.println("9");
        StringBuilder string = new StringBuilder(number);
        while(true) {
            string = repeat(string, length, final_length);
            if(string.length() == final_length) return string.toString();
        }
    }
    private static StringBuilder repeat(StringBuilder string, int length, int final_length) {
        for(int j = 0 ; j <length-1; j++) {
            if(string.charAt(j) < string.charAt(j+1)) {
                string.deleteCharAt(j);
                return string;
            }
        }
        return string.delete(final_length, length);
    }
}