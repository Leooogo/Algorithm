import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[10001];

        for(int i = 0; i < n; i++) {
            array[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        for(int i = 1; i < 10001; i++) {
            while(array[i] > 0) {
                sb.append(i).append("\n");
                array[i]--;
            }
        }
        System.out.println(sb);
    }
}