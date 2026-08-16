package arrays;

public class SecondSmallestElement {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,12,14,54,34,56,76,78,89,0,-1};
//        find second smallest element
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second)
            {
                second=arr[i];
            }
        }
        System.out.println("Second Smallest Element: "+second);
    }
}
