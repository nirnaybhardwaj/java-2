import java.util.ArrayList;
import java.util.Scanner;

public class Remove_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(sc.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
    public static void solution(ArrayList<Integer> al){
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            if(isPrime(val) == true){
                al.remove(i);
            }
        }

    }
    public static boolean isPrime(int n){

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
