import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n){

        if(n == 1) {
            return 1;

        }
        int fac = factorial(n - 1);

        return n * fac;
    }
}
