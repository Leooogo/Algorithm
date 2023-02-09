import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(search(array, n, m));
    }

    static int search(int[] array, int n, int m) {
        int result = 0;

        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    int sum = array[i] + array[j] + array[k];

                    if(m == sum) {
                        return sum;
                    }

                    if(result < sum && sum < m) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}