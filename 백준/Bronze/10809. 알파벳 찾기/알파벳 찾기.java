import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        int array[] = new int[26];

        for(int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for(int i = 0; i < s.length(); i++) {
            char result = s.charAt(i);

            if(array[result - 'a'] == -1) {
                array[result - 'a'] = i;
            }
        }

        for(int val: array) {
            System.out.print(val + " ");
        }
    }
}
