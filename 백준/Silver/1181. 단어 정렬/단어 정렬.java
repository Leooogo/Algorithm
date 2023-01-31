import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        StringBuilder sb = new StringBuilder();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        sc.close();
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        sb.append(array[0]).append("\n");

        for(int i = 1; i < n; i++) {
            if(!array[i].equals(array[i-1])) {
                sb.append(array[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
