import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][2];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(array, (e1, e2) -> {
            if(e1[1] == e2[1]) return e1[0] - e2[0];
            else return e1[1] - e2[1];
        });

        for(int i = 0; i < n; i++) {
            sb.append(array[i][0] + " " + array[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}