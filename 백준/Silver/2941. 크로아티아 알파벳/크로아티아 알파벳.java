import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        sc.close();

        int count = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count++;
        }

        for(int j = 0; j < chars.length-1; j++) {
            if((chars[j] + "" + chars[j+1]).equals("c=") || (chars[j] + "" + chars[j+1]).equals("c-") || (chars[j] + "" + chars[j+1]).equals("d-") || (chars[j] + "" + chars[j+1]).equals("lj") || (chars[j] + "" + chars[j+1]).equals("nj") || (chars[j] + "" + chars[j+1]).equals("s=") || (chars[j] + "" + chars[j+1]).equals("z=")) {
                count--;
            }
        }

        for(int j = 0; j < chars.length-2; j++) {
            if((chars[j] + "" + chars[j+1] + "" + chars[j+2]).equals("dz=")) {
                count--;
            }
        }

        System.out.println(count);
    }
}