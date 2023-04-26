public class ProblemsonArrays {
    // find the max element in the given arrays//
    public static void largestelement(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("the largest element is : " + ans);
    }

    // find the x element in the given array//
    public static int findkey(int arr[], int key) {
        // int key=10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // count the number of occurrences of a particular element in the array//
    public static int numOfOccurrences(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(x + "occurred: " + count);
        return count;
    }

    // find the last occurrences in the given array//
    public static int lastOccurrences(int arr[], int x) {
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastindex = i;
            }
        }
        System.out.println(lastindex);
        return lastindex;
    }

    // count the number strictly greater than x//
    public static int strictlyGreater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    // CHECK IF ARRAY IS SORTED OR NOT?
    public static boolean isSorted(int arr[]) {
        boolean ans = true;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i+1] < arr[i]) {
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 7, 9, 9, };
        int key = 9;
        largestelement(arr);
        System.out.println(findkey(arr, key));
        numOfOccurrences(arr, key);
        // System.out.println(count);
        lastOccurrences(arr,key);
        System.out.println(strictlyGreater(arr,4));
        
        System.out.println(isSorted(arr));
    }

}
