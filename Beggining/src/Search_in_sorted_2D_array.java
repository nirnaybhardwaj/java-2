import java.util.Scanner;

public class Search_in_sorted_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == x) {
                System.out.println(row);
                System.out.println(col);
                return;
            } else if (arr[row][col] < x) {
                row++;
            } else if (arr[row][col] > x) {
                col--;
            }
        }
        System.out.println("Not Found");
    }
}
