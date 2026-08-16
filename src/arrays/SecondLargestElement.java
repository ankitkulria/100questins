package arrays;

public class SecondLargestElement {
    static void main() {
        int[] arr={1,2,3,34,12,56,71,23,5,7,99};
//        second largest element
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second)
            {
                second=arr[i];
            }
        }
        System.out.println("Second Largest Element: "+second);
    }
}
