package arrays.sorting;

public class InsertionSort {
    static void main() {
        int[] arr={4,3,5,9,1,8,2};

        System.out.println("Unsorted Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
//        we consider first element as already sorted so we start our loop from index-1
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1]=temp;
        }
        System.out.println("\nSorted Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}
