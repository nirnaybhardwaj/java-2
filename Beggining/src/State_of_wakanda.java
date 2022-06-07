import java.util.Scanner;

public class State_of_wakanda {
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
        for (int i = 0; i < col; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j][i]);
                }
            }else{
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[j][i]);
                }
            }
        }
    }
}
