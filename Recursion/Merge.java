import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int[] arr ={10,2,23,134,35,11,23,45,6,7,9};

        
        arr= merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid  = arr.length / 2;

        int[] left =  merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right =  merge(Arrays.copyOfRange(arr, mid, arr.length));
         
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix  = new int[first.length +  second.length];

        int j = 0;
        int i = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            } 
            k++;
            
        }

        // its may be possible that one of the array is not traversed completely
        //copy the remanin elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length) {
            mix[k] = second[j];
            j++;
            k++;
            
        }

        return mix; 



    }
    
}
