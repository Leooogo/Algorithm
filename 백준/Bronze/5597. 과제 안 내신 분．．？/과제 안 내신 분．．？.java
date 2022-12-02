import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] array = new boolean[30];

        for(int i = 0; i < 28; i++) {
            int number = sc.nextInt();
            array[number-1] = true;
        }

        for(int i = 0; i < 30; i++) {
            if(array[i] == false) {
                System.out.println(i+1);
            }
        }
    }
}