public class Main {
    public static int d(int n) {
        int newN = n;

        while(n > 0) {
            newN += n % 10;
            n /= 10;
        }

        return newN;
    }

    public static void main(String[] args) {
        boolean array[] = new boolean[10001];

        for(int i = 1; i <= 10000; i++) {
            int j = d(i);
            if(j <= 10000) array[j] = true;
        }

        for(int i = 1; i <= 10000; i ++) {
            if(array[i] == false) System.out.println(i);
        }
    }
}