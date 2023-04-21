public class Bubblesort {
    public static void bubblesort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
                /*
                 * last i elements are already sorted at correct sorted positions,so no need to
                 * check them
                 */
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;// some swap has happened
                }
            }
            if (flag == false) { // */ has some swap occured or not? yha ye check kr rhe hain../
                return;
            }
        }
    }

    public static void main(String args[]) {
        int[] a = { 7, 6, 100, 4, 8 };
        bubblesort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
