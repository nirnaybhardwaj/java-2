import java.util.Scanner;

public class Ring_Rotate {
    public static void rotate(int[] a, int k){
        // write your code here
        int length = a.length;
        k = k % length;
        if(k <0){
            k = k + length;
        }
        reverse(a, 0, length - k - 1);
        reverse(a, length - k, length - 1);
        reverse(a, 0, length - 1);
    }
    public static void reverse(int[] a,int a1, int a2) {

        while (a1 <= a2) {
            int temp = a[a1];
            a[a1] = a[a2];
            a[a2] = temp;

            a1++;
            a2--;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        int sr = 0;
        int sc = 0;
        int er = n - 1;
        int ec = m - 1;

        sr = sr + 1 * (s - 1);
        sc = sc + 1 * (s - 1);
        er = er - 1 * (s - 1);
        ec = ec - 1 * (s - 1);

        int size = (er - sr + 1) + (ec - (sc + 1) + 1) + ((er - 1) - sr + 1) + ((ec - 1) - (sc + 1) + 1);

        int [] store = new int[size];

        int index = 0;
        for (int i = sr; i <= er ; i++) {
            store[index] = arr[i][sc];
            index ++;
        }
        for (int i = sc + 1; i <= ec ; i++) {
            store[index] = arr[er][i];
            index++;
        }
        for (int i = er - 1; i >= sr; i--) {
            store[index] = arr[i][ec];
            index++;
        }
        for (int i = ec -1; i >= sc + 1; i--) {
            store[index] = arr[sr][i];
            index++;
        }

        rotate(store, r);

        index = 0;
        for (int i = sr; i <= er ; i++) {
            arr[i][sc] = store[index];
            index ++;
        }
        for (int i = sc + 1; i <= ec ; i++) {
            arr[er][i] = store[index];
            index++;
        }
        for (int i = er - 1; i >= sr; i--) {
            arr[i][ec] = store[index];
            index++;
        }
        for (int i = ec -1; i >= sc + 1; i--) {
            arr[sr][i] = store[index];
            index++;
        }
        display(arr);
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
