import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            boolean isPn = true;

            if(number == 1) continue;

            for(int j = 2; j <= Math.sqrt(number); j++) {
                if((number % j) == 0) isPn = false;
            }

            if(isPn) count++;
        }

        sc.close();

        System.out.println(count);
    }
}
