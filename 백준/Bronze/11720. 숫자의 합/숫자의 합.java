import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        sc.close();

        for(int i = 0; i < n; i++) {
            char result = str.charAt(i);
            int number = Character.getNumericValue(result);
            sum += number;
        }

        System.out.println(sum);
    }
}