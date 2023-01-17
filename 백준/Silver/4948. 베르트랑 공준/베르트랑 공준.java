import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            boolean nopn[] = new boolean[2*n];
            int count = 0;

            if(n == 0) break;

            nopn[0] = true;
            nopn[1] = true;

            for(int i = 2; i <= Math.sqrt(2*n); i++) {
                for(int j = i*i; j < 2*n; j += i) {
                    nopn[j] = true;
                }
            }

            for(int i = n+1; i < 2*n; i++) {
                if(nopn[i] == false) {
                    count++;
                }
            }

            if(n == 1) System.out.println(1);
            else System.out.println(count);

            count = 0;
        }
    }
}