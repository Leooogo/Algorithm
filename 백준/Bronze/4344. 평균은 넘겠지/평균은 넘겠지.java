import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            int sum = 0;

            for(int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
                sum += array[j];
            }

            double avg = (double) sum / n;
            double count = 0;

            for(int j = 0; j < n; j++) {
                if(array[j] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", count / n * 100);
        }
        sc.close();
    }
}
