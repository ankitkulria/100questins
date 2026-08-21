package arrays.sorting;

public class BubbleSort {
    static void main() {
        int[] arr={2,1,4,3,5,6,7,23,21,12,34,21,32,56,43};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}
