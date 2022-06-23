import java.util.Scanner;

public class Print_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDecreasing(n);
    }
    public static void printDecreasing(int n){

        if(n >= 1){
            System.out.println(n);
        }
        else{
            return;
        }
        printDecreasing(--n);
    }
}
