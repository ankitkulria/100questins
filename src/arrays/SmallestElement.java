package arrays;

import java.util.Scanner;

public class SmallestElement {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,-1,-12,-56,-98};
//        we have to find the smallest element
//        let arr[0] is the smallest
        int min=arr[0];
//        now check other elements
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Element:"+min);
    }
}
