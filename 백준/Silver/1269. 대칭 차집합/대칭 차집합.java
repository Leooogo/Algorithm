import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int counter = 0;

        for(int i = 0; i < a; i++) {
            set1.add(sc.nextInt());
        }

        for(int i = 0; i < b; i++) {
            set2.add(sc.nextInt());
        }

        sc.close();

        for(int number: set1) {
            if(!set2.contains(number)) {
                counter++;
            }
        }

        for(int number: set2) {
            if(!set1.contains(number)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}