import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int newN = n, cycle = 0, a = 0, b = 0;

        while(true) {
            a = newN / 10;
            b = newN % 10;

            newN = b * 10 + (a+b) % 10;
            cycle++;

            if(newN == n) break;
        }
        System.out.println(cycle);
    }
}