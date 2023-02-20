import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> set = new HashSet<>();

        sc.close();

        for(int i = 1; i < s.length()+1; i++) {
            for(int j = 0; j < s.length()-i+1; j++) {
                set.add(s.substring(j, j+i));
            }
        }

        System.out.println(set.size());
    }
}