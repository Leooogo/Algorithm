import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();

        sc.close();

        int array[] = new int[26];
        int max = -1;
        int index = 0;

        for(int i = 0; i < word.length(); i++) {
            array[word.charAt(i) - 'A']++;
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        char result = (char)(index + 'A');

        for(int i = 0; i < array.length; i++) {
            if(max == array[i] && index != i) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
