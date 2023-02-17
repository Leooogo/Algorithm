import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int m = sc.nextInt();

        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();

            sb.append(hm.getOrDefault(num, 0)).append(" ");
        }

        sc.close();

        System.out.println(sb);
    }
}