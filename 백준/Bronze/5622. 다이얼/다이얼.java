import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int sum = 0;
        int count = 2;

        sc.close();

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch < 'D') {
                count++;
            } else if(ch < 'G') {
                count += 2;
            } else if(ch < 'J') {
                count += 3;
            } else if(ch < 'M') {
                count += 4;
            } else if(ch < 'P') {
                count += 5;
            } else if(ch < 'T') {
                count += 6;
            } else if(ch < 'W') {
                count += 7;
            } else {
                count += 8;
            }
            sum += count;
            count = 2;
        }

        System.out.println(sum);
    }
}