import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 666;
        int counter = 1;

        sc.close();

        while(counter != n) {
            num++;

            if(String.valueOf(num).contains("666")) counter++;
        }

        System.out.println(num);
    }
}