package Array;

public class Remove_Duplicate {
    public static int duplicate(int arr[], int n) {
        // base case
        if(n== 0 || n == 1){
            return n;
        }
        int j =0;

        for(int i =0; i< n-1;i++){
            // compare value of first idex and next idex.
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        // assign last value in the last position in the original array.
        arr[j++] =  arr[n-1];
       return j;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,3,4,4,5,5,5,5};
        int len = arr.length;
        // assign duplicate function length into length of new array.
         len = duplicate(arr,len);
         // printing array elements.
        for(int i=0; i<len;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
