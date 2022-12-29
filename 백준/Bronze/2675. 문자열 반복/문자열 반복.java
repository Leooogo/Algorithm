import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for(int i = 0; i < p; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            for(int r = 0; r < s.length(); r++) {
                char ch = s.charAt(r);

                for(int j = 0; j < n; j++) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}