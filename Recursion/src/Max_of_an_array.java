import java.util.Scanner;

public class Max_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxOfArray(arr, 0);
        System.out.println(ans);
    }
    public static int maxOfArray(int[] arr, int idx){

        if(idx == arr.length) return Integer.MIN_VALUE;

        int a = maxOfArray(arr, idx + 1);

        int max = Math.max(arr[idx], a);

        return max;
    }
}
