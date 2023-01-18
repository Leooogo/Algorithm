import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int div, rem;
            div = n / 2;
            rem = n - div;

            while(true) {
                if(isPrime(div) && isPrime(rem)) {
                    break;
                } else {
                    div--;
                    rem++;
                }
            }
            System.out.println(div + " " + rem);
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        boolean check = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
            }
        }
        return check;
    }
}