import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int order = 0;
        int number;

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr[] = new int[m];

        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int value: array) {
            if(!hm.containsKey(value)) {
                hm.put(value, order);
                order++;
            }
        }

        for(int key: arr) {
            if(hm.containsKey(key)) number = 1;
            else number = 0;

            sb.append(number).append(" ");
        }

        System.out.println(sb);
    }
}