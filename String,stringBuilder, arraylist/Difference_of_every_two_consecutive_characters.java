import java.util.Scanner;

public class Difference_of_every_two_consecutive_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i -1);
            int gap = ch1 - ch2;

            sb.append(gap);
            sb.append(ch1);
        }

        return sb.toString();
    }
}
