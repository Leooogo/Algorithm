import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int firstHundred = a / 100;
        int firstTen = a / 10 - firstHundred * 10;
        int firstOne = a % 10;
        int secondHundred = b / 100;
        int secondTen = b / 10 - secondHundred * 10;
        int secondOne = b % 10;
        int newA = firstOne * 100 + firstTen * 10 + firstHundred;
        int newB = secondOne * 100 + secondTen * 10 + secondHundred;

        if(newA > newB) System.out.println(newA);
        else System.out.println(newB);
    }
}
