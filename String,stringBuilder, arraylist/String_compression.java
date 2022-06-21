import java.util.Scanner;

public class String_compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(compression1(str);
//        System.out.println(compression2(str);

        // ---we can do it by  STRING BUILDER ALSO LIKE THIS --- //

        String_builder str = new String_builder();
        System.out.println(compression1(str.toString()));
        System.out.println(compression2(str.toString()));
    }
    public static String compression1(String str){
        String ans = "";
        for (int i = 0; i < str.length(); ) {
            char ch = str.charAt(i);
            int count = 0;
            while(i < str.length() && str.charAt(i) == ch){
                count++;
                i++;
            }
            ans += ch;

        }

        return ans;
    }

    public static String compression2(String str){
        String ans = "";
        for (int i = 0; i < str.length(); ) {
            char ch = str.charAt(i);
            int count = 0;
            while(i < str.length() && str.charAt(i) == ch){
                count++;
                i++;
            }
            ans += ch;
            if(count > 1){
                ans += count;
            }
        }

        return ans;
    }
}
