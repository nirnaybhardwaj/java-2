import java.util.Scanner;

public class TwoD_array_demo {
    public static void main(String[] args) {

        int [][] arr = new int[3][4];
//        System.out.println(arr[2][5]); // error - index out of bounds

//        System.out.println(arr[1][1]);// 0

        int [][] arr1 = {{23, 45},
                         {34, 67},
                         {89, 98}
        };
//        System.out.println(arr1[1][1]);// 67

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+",");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr2 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
