public class ArraysProblem2 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // reverse the array using for loops//
    public static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        // traverse original array in reverse direction//
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    // reverse the original array with extra making new array using while loop//
    public static int[] reverseArraymethod_2(int arr[]) {
        int n = arr.length;
        int i = n - 1;
        int j = 0;
        int ans[] = new int[n];
        while (i >= 0) {
            ans[j++] = arr[i--];
        }
        return ans;
    }

    // swap the elements of array//
    public static void swapInarray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // reverse the array without making the new array//
    public static void reverseArr(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            // swap the element of arrays//
            swapInarray(arr, i, j);
            i++;
            j--;
        }

    }

    // rotation of array with making new extra array//
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // reverse the array element with selected indices//
    public static void reverse_2(int arr[], int i, int j) {
        while (i < j) {
            swapInarray(arr, i, j);
            i++;
            j--;
        }
    }

    // rotate the given array by k steps without using extra space//
    public static void rotateInplace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse_2(arr, 0, n - k - 1);
        reverse_2(arr, n - k, n - 1);
        reverse_2(arr, 0, n - 1);
        return;
    }
    // making frequency array//
    static int [] makefrequencyArray(int arr[]){
        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // int ans[] = reverseArraymethod_2(arr);
        // printArray(ans);
        // reverseArr(arr);
        // printArray(arr);
        // int ans_2[]=rotate(arr,100);
        // printArray(ans_2);
        rotateInplace(arr,104);
        printArray(arr);
        int freq[]=makefrequencyArray(arr);
        int q=3;
        int x=5;
        while(q>0){
            q--;
            if(freq[x]>0){
                System.out.println("yes");
            }
        }

    }
}
