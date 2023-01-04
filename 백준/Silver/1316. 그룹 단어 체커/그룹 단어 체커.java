import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;

        for(int i = 0; i < n; i++) {
            String word = sc.next();
            char[] chars = word.toCharArray();
            List<Character> list = new ArrayList<>();

            for (int j = 0; j < chars.length; j++) {
                if(j == 0) continue;

                if(chars[j] != chars[j-1]) {
                    list.add(chars[j-1]);

                    if(list.contains(chars[j])) {
                        count--;
                        break;
                    }
                }
            }
        }

        sc.close();

        System.out.println(count);
    }
}