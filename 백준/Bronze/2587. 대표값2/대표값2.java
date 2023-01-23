import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int sum = 0;
        int avg = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        sc.close();
        Arrays.sort(array);

        avg = sum / 5;
        
        System.out.println(avg);
        System.out.println(array[2]);
    }
}
