package arrays;

public class RearrangeElementsinAscendingDescendingOrder {
    static void main() {
        int[] arr={4,5,3,2,6,7,3,2};
        int n=arr.length;
//        first of all we have to sort the array in ascending order
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
//        now divide the array in  parts and reverse the second half
        int start=n/2;
        int end=n-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}
