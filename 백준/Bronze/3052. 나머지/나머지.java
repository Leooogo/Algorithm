import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int modulo = 42;
        int count = 0;

        for(int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
            array[i] = array[i] % modulo;
        }
        sc.close();
        Arrays.sort(array);

        for(int i = 0; i < 9; i++) {
            if(array[i] != array[i+1]) {
                count++;
            }
        }

        System.out.println(count+1);
    }
}