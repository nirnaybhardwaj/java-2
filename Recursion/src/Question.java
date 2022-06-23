import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int size = sc.nextInt();
            int fuel = sc.nextInt();

            int[] arr = new int[size];
            for (int j = 0; j < arr.length; j++) {
                arr[i] = sc.nextInt();
            }
        }

    }
}
