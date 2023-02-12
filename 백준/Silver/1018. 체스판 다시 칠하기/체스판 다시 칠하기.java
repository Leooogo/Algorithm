import java.util.Scanner;

public class Main {

    public static boolean[][] array;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        array = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            String str = sc.next();

            for(int j = 0; j < m; j++) {
                if(str.charAt(j) == 'W') array[i][j] = true;
                else array[i][j] = false;
            }
        }

        sc.close();

        int row = n - 7;
        int col = m - 7;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int endX = x+8;
        int endY = y+8;
        int counter = 0;
        boolean tf = array[x][y];

        for(int i = x; i < endX; i++) {
            for(int j = y; j < endY; j++) {
                if(array[i][j] != tf) counter++;

                tf = !tf;
            }

            tf = !tf;
        }

        counter = Math.min(counter, 64 - counter);
        min = Math.min(min, counter);
    }
}