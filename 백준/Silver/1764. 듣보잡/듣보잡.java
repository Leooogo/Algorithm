import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        for(int i = 0; i < m; i++) {
            String name = sc.next();

            if(set.contains(name)) list.add(name);
        }

        sc.close();
        Collections.sort(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}