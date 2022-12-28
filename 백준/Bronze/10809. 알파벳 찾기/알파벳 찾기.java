import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
    }
}