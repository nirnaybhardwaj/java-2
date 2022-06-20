import java.util.Scanner;

public class Saddle_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int row = 0; row < n; row++) {
            int colIndex = returnColIndexWithMinValue(arr, row);

            if(checkBiggestOrNot(arr, row, colIndex) == true){
                System.out.println(arr[row][colIndex]);
                return;
            }
        }
        System.out.println("Invalid Input");

    }
    public static int returnColIndexWithMinValue(int[][] arr, int row){

        int colIndex = 0;
        int minVal = Integer.MAX_VALUE;

        for (int col = 0; col < arr[0].length; col++) {
            if(arr[row][col] < minVal){
                minVal = arr[row][col];
                colIndex = col;
            }
        }
        return colIndex;
    }
    public static boolean checkBiggestOrNot(int[][] arr, int row, int col){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col] > arr[row][col]){
                return false;
            }
        }
        return true;
    }
}
