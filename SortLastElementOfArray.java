import java.util.Arrays;

public class SortLastElementOfArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 1};

        lastNumberInSortedPosition(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void lastNumberInSortedPosition(int[] a) {
        int n = a.length;
        int last = a[n - 1];

        int swapIndex;
        for(swapIndex = n - 2; swapIndex >= 0 && a[swapIndex] > last; --swapIndex) {
        }

        for(int i = n - 1; i >= swapIndex + 2; --i) {
            a[i] = a[i - 1];
        }

        a[swapIndex + 1] = last;
    }
}

