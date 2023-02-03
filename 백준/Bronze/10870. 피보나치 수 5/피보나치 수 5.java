import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int num) {
        if(num <= 1) return num;
        else return fibonacci(num-2) + fibonacci(num-1);
    }
}