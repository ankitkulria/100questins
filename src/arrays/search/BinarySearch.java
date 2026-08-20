package arrays.search;

import java.util.Arrays;

public class BinarySearch {
    static void main() {
        int[] arr={1,2,45,34,12,23,32,56,78,89};
//        {1,2,12,23,32,34,45,56,78,89}
        Arrays.sort(arr);
        int target=0;
        boolean found=false;
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high)
        {
            if(arr[mid]==target)
            {
                found=true;
                System.out.println("Element "+target+" found at Index: "+mid);
                return;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
                mid=(low+high)/2;
            }
            else
            {
                low=mid+1;
                mid=(low+high)/2;
            }
        }
        if(found==false)
        {
            System.out.println("Element not found");
        }
    }
}
