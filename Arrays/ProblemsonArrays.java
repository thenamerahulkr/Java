public class ProblemsonArrays {
    // find the max element in the given arrays
    public static void largestelement(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("the largest element is : " + ans);
    }

    public static int findkey(int arr[], int key) {
        // int key=10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 7, 5, 9, 1 };
        int key = 9;
        // largestelement(arr);
        System.out.println(findkey(arr, key));

    }

}
