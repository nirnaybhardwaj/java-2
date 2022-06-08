import java.util.Scanner;

public class Exit_point_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int dir = 0;
        int n = arr.length;
        int m = arr[0].length;

        int row = 0;
        int col = 0;

        while(true){
            dir = (dir + arr[row][col]) % 4;

            if(dir == 0){
                col++;
            }
            else if(dir == 1){
                row++;
            }
            else if(dir == 2){
                col--;
            }
            else if(dir == 3){
                row--;
            }

            if(row < 0){
                row++;
                break;
            } else if (col < 0) {
                col++;
                break;
            } else if (row >= n) {
                row--;
                break;
            } else if (col >= m) {
                col--;
                break;
            }
        }
        System.out.println(row);
        System.out.println(col);
    }
}
