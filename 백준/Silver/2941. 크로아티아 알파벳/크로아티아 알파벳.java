import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        sc.close();

        for(int i=0; i < croatian.length ;i++)
            word = word.replaceAll(croatian[i], "*");

        System.out.println(word.length());
    }
}