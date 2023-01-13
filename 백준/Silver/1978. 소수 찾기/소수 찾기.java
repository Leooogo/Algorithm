import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        boolean ispn[] = new boolean[n];
        int pn[] = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int count = 0;

        for(int i = 0; i < n; i++) {
            number[i] = sc.nextInt();

            if(number[i] == 1) ispn[i] = true;
            else if(number[i] != 2 && number[i]%2 == 0) ispn[i] = true;
            else if(number[i] != 5 && number[i]%5 == 0) ispn[i] = true;

            for(int j = 0; j < 25; j++) {
                if(pn[j]*pn[j] == number[i]) ispn[i] = true;
                else if(pn[j] != number[i] && number[i]%pn[j] == 0) ispn[i] = true;
            }

            if(ispn[i] == false) count++;
        }
        sc.close();

        System.out.println(count);
    }
}
