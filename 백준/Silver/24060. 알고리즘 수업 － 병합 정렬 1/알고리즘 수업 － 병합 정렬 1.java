import java.util.Scanner;

public class Main {
    static int arr[];
    static int k;
    static int count = 0;
    static int result = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        int array[] = new int[n];
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        merge_sort(array, 0, n-1);

        System.out.println(result);
    }

    static void merge_sort(int A[], int low, int high) {
        if(low < high) {
            int mid = (low+high) / 2;

            merge_sort(A, low, mid);
            merge_sort(A, mid+1, high);
            merge(A, low, mid, high);
        }
    }

    static void merge(int A[], int low, int mid, int high) {
        int i = low, j = mid+1, t = 0;

        while(i <= mid && j <= high) {
            if(A[i] <= A[j]) arr[t++] = A[i++];
            else arr[t++] = A[j++];
        }

        while(i <= mid) {
            arr[t++] = A[i++];
        }

        while(j <= high) {
            arr[t++] = A[j++];
        }

        t = 0;
        i = low;

        while(i <= high) {
            count++;
            
            if(count == k) {
                result = arr[t];
                break;
            }
            
            A[i++] = arr[t++];
        }
    }
}