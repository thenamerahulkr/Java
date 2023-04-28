import java.util.Scanner;

public class sortbyParity {
    static void printArray(int arr[]) {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortbyParity(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left<right){
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                // swap
                swap(arr, left, right); // swap function call here //
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);
        System.out.println("sorted array");
        sortbyParity(arr);
        printArray(arr);
    }

}
