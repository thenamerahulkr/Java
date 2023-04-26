import java.util.Arrays;
import java.util.Scanner;

public class ArrayDay1 {
    public static int[] smallestAndLargest(int arr[]) {
        Arrays.sort(arr);
        int ans[] = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    // number of pairs whose sum = given target
    public static int pairSum(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; i++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int triPlet(int arr[], int target) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int max(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
              largest=arr[i];
            }
        }
        return largest;
    }
    public static int secondMax(int arr[]){
        int mx=max(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int ans=max(arr);
       return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int []ans=smallestAndLargest(arr);
        for(int i=0;i<arr.length-2;i++){
        System.out.print(ans[i]+" ");
        }
        System.out.println(pairSum(arr, 8));
        System.out.println("total count");
        System.out.println(triPlet(arr,12));
        System.out.println(secondMax(arr));

    }
}
