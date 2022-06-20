import java.util.Scanner;

public class Diagonal_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int col = 0; col < n; col++) {
            int r = 0;
            int c = col;
            while(c < n && r < n){
                System.out.println(arr[r][c]);
                r++;
                c++;
            }
        }
    }
}
