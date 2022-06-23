import java.util.Scanner;

public class Power_linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int ans = power(n,p);
        System.out.println(ans);
    }
    public static int power(int x, int n){

        if(n == 0) return 1;
        int p = power(x, n - 1);
        int pow = x * p;

        return pow;
    }
}
