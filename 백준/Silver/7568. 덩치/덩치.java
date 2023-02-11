import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][2];

        for(int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        sc.close();

        for(int i = 0; i < n; i++) {
            int rank = 1;

            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if(array[i][0] < array[j][0] && array[i][1] < array[j][1]) rank++;
            }

            System.out.print(rank + " ");
        }
    }
}