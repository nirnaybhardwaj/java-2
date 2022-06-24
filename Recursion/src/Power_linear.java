import java.util.Scanner;

public class Power_linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int ans = 0;

//        if(p < 0){
//            ans = power(n, -p);
//            System.out.println(1 * 1.0/ ans);
//        }else {

            ans = power(n, p);
            System.out.println(ans);
//        }

    }
    public static int power(int x, int n){

        if(n == 0) return 1;
        int p = power(x, n - 1);

        return x * p;
    }
}
