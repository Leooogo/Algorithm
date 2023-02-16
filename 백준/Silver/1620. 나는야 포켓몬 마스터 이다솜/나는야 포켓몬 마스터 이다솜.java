import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<Integer,String> hm2 = new HashMap<Integer, String>();

        for(int i = 1; i <= n; i++) {
            String poke = sc.next();

            hm1.put(poke, i);
            hm2.put(i, poke);
        }

        for(int i = 0; i < m; i++) {
            String temp = sc.next();

            if(Character.isDigit(temp.charAt(0))) {
                int val = Integer.parseInt(temp);
                sb.append(hm2.get(val)).append("\n");
            } else sb.append(hm1.get(temp)).append("\n");
        }

        sc.close();

        System.out.println(sb);
    }
}
