import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }

        br.close();
        Arrays.sort(array);

        boolean flag = false;
        int max = 0;
        int mode = 10000;

        for(int i = 0; i < n; i++) {
            int jump = 0;
            int count = 1;
            int value = array[i];

            for(int j = i+1; j < n; j++) {
                if(value != array[j]) break;
                else {
                    count++;
                    jump++;
                }
            }

            if(count > max) {
                max = count;
                mode = value;
                flag = true;
            } else if(count == max && flag == true) {
                mode = value;
                flag = false;
            }

            i += jump;
        }

        System.out.println((int)Math.round((double) sum / n));
        System.out.println(array[n/2]);
        System.out.println(mode);
        System.out.println(array[n-1] - array[0]);
    }
}