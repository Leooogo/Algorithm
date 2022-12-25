import java.util.Scanner;

public class Main {
    public static int x(int n) {
        int count = 0;

        if(n < 99) {
            return n;
        } else if (n <= 110) {
            return 99;
        } else {
            for(int i = 111; i <= n; i++) {
                int hundred = i / 100;
                int ten = (i - (hundred * 100)) / 10;
                int one = i % 10;

                if((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
            return 99 + count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(x(n));
    }
}