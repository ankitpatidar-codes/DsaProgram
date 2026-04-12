package Dsa;

public class SearchInRange {
    public static void main(String args[]) {
        int arr[] = {18, -7, 14, 3, 25, 35};
        int target = 18;
        System.out.println(search(arr,target,1,4));
    }

    static int search(int arr[], int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return 1;
            }
        }
        return -1;

    }
}
