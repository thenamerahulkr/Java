public class Arrays2D {
    public static void printArrays2D(int[][] arr){
        //traverse outer arrays through i wala loop
        for(int i=0;i<arr.length;i++){
            //traverse inner array through j inner wala loops
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main (String args[]){
        int [][] arr={{1,2},{3,4,6}};
        printArrays2D(arr);
    }
}
