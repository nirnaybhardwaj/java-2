import java.util.Scanner;

public class Toggale_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
    }
    public static String toggleCase(String str){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char newCh = (char)(ch-32);
                sb.append(newCh);
            }else{
                char newCh = (char)(ch+32);
                sb.append(newCh);
            }
        }

        return sb.toString();
    }
}
