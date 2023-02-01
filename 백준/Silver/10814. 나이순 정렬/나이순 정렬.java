import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[][] = new String[n][2];
        StringBuilder sb = new StringBuilder();

        sc.nextLine();

        for(int i = 0; i < n; i++) {
            array[i][0] = sc.next();
            array[i][1] = sc.next();
        }

        sc.close();
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0; i < n; i++) {
            sb.append(array[i][0] + " " + array[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}