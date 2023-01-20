import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[9][9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int max = array[0][0];
        int row = 0;
        int col = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((row+1) + " " + (col+1));
    }
}