import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        sc.close();

        int result = str.charAt(0);

        System.out.println(result);
    }
}
