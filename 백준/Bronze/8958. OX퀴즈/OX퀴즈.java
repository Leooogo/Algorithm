import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        sc.nextLine();

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

        sc.close();
        
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            int count = 0;

            for(int j = 0; j < array[i].length(); j++) {
                if(array[i].charAt(j) == 'O') {
                    count++;

                } else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}