import java.util.Scanner;

public class Print_all_pallindrome_substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);

    }
    public static void solution(String str){
        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {
                String temp = str.substring(i, j + 1);
                if(isPallindrome(temp) == true){
                    System.out.println(temp);
                }
            }
        }

    }
    public static boolean isPallindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
