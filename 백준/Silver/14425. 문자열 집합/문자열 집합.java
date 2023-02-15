import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String array1[] = new String[n];
        String array2[] = new String[m];
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int order = 0;
        int counter = 0;

        for(int i = 0; i < n; i++) {
            array1[i] = sc.next();
        }

        for(int i = 0; i < m; i++) {
            array2[i] = sc.next();
        }

        sc.close();

        for(String value: array1) {
            if(!hm.containsKey(value)) {
                hm.put(value, order);
                order++;
            }
        }

        for(String key: array2) {
            if(hm.containsKey(key)) counter++;
        }

        System.out.println(counter);
    }
}
