import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean nopn[] = new boolean[n+1];

        sc.close();

        nopn[0] = true;
        nopn[1] = true;

        for(int i = 2; i <= Math.sqrt(n+1); i++) {
            for(int j = i*i; j < n+1; j += i) {
                nopn[j] = true;
            }
        }

        for(int i = m; i <= n; i++) {
            if(nopn[i] == false) {
                System.out.println(i);
            }
        }
    }
}