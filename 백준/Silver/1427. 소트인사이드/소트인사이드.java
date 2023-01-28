import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char[] chars = new char[n.length()];

        br.close();

        for(int i = 0; i < n.length(); i++) {
            chars = n.toCharArray();
        }

        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));

        System.out.println(sb.reverse().toString());
    }
}