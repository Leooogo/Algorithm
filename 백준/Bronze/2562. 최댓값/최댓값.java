import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[9];
        int max = 0;
        int count = 0;

        for(int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
            if(max < array[i]) {
                max = array[i];
                count = i + 1;
            }
        }
        sc.close();

        System.out.println(max);
        System.out.println(count);
    }
}