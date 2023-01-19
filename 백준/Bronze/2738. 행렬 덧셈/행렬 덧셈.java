import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[][] = new int[2*n][m];
        int sum = 0;

        for(int i = 0; i < 2*n; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sum = array[i][j] + array[i+n][j];

                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
