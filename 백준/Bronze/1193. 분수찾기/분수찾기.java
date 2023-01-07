import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;

        sc.close();

        while(true) {
            int sum = n * (n+1) / 2;

            if(x <= sum) {
                break;
            }
            n++;
        }

        int k = x - ((n-1) * n / 2);

        if((n%2) == 1) System.out.println((n-k+1) + "/" + k);
        else System.out.println(k + "/" + (n-k+1));
    }
}