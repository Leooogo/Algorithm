import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        System.out.println(factorial(n));
    }
    
        static int factorial(int num) {
            if(num <= 1) return 1;
            else return num * factorial(num-1);
    }
}
