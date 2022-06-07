import java.util.Scanner;

public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int [][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if(c1 != r2){
            System.out.println("Invalid input");
            return;
        }

        int [][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < r2; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                mul[i][j] = sum;
            }
        }
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }

}
