import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int arr[] = new int[n];
        int order = 0;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> orderMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++) {
            arr[i] = array[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);

        for(int value: arr) {
            if(!orderMap.containsKey(value)) {
                orderMap.put(value, order);
                order++;
            }
        }

        for(int key: array) {
            int number = orderMap.get(key);

            sb.append(number).append(" ");
        }

        System.out.println(sb);
    }
}