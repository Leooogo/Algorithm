import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k, n;

        for(int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            int array[] = new int[n];

            for(int x = 0; x <= k; x++) {
                for(int y = 0; y < n; y++) {
                    if(y == 0) array[y] = 1;
                    else {
                        if(x == 0) array[y] = y+1;
                        else array[y] += array[y-1];
                    }
                }
            }
            System.out.println(array[n-1]);
        }
        sc.close();
    }
}