import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(isPalindrome(sc.next()));
        }

        sc.close();
    }

    static String recursion(String s, int l, int r, int count) {
        if(l >= r) return "1 " + count;
        else if (s.charAt(l) != s.charAt(r)) return "0 " + count;
        else {
            count++;
            return recursion(s, l+1, r-1, count);
        }
    }

    static String isPalindrome(String s) {
        return recursion(s, 0, s.length()-1, 1);
    }
}