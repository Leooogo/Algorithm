import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 100001, max = -1000001;

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.println(min + " " + max);
    }
}