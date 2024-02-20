package string.programs;

public class SumValue{
public static void getSumPair(int[] arr, int k) {
    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
        int sum = arr[i] + arr[j];
        if (sum == k) {
            System.out.println(arr[i] + " " + arr[j]);
            i++;
            j--;
        } else if (sum < k) {
            i++;
        } else {
            j--;
        }
    }
}

public static void main(String[] args) {
    int[] arr = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 90, 9, 10};
    int k = 7;
    getSumPair(arr, k);
}
}
