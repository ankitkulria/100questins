package arrays;

import java.util.Arrays;

public class MedianOfArray {
    static void main() {
//        change the number of elements for different cases- even/odd
        int[] arr={1,2,3,4,5,6,7,8,12,11};
        Arrays.sort(arr);
        if(arr.length%2!=0)
        {
            int idx=arr.length/2;
            System.out.println("Median :"+arr[idx]);
        }
        else
        {
            int idx2=arr.length/2;
            float mdn=(float)(arr[idx2]+arr[idx2-1])/2;
            System.out.println("Median : "+mdn);

        }
        System.out.println();
    }
}
