import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double array[] = new double[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(array);

        double max = array[n-1];
        double sum = 0;

        for(int i = 0; i < n; i++) {
            array[i] = (array[i] / max) * 100;
            sum += array[i];
        }
        
        System.out.println(sum / n);
    }
}