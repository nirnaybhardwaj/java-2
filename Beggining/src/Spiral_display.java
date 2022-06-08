import java.util.Scanner;

public class Spiral_display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sr = 0;
        int scc = 0;
        int er = arr.length - 1;
        int ec = arr[0].length - 1;

        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        while(count < n * m){
            for (int i = sr; i <= er && count < n * m; i++) {
                System.out.println(arr[i][scc]);
//
                count++;
            }
            for (int i = scc + 1; i <= ec && count < n * m; i++) {
                System.out.println(arr[er][i]);
//
                count++;
            }
            for (int i = er - 1; i >= sr && count < n * m; i--) {
                System.out.println(arr[i][ec]);
//
                count++;
            }
            for (int i = ec - 1; i >= scc + 1 && count < n * m; i--) {
                System.out.println(arr[sr][i]);
//
                count++;
            }
            scc++;
            sr++;
            ec--;
            er--;

        }
    }
}
