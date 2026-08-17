package arrays;

public class RemoveDuplicatedFromSortedArray {
    static void main() {
        int[] arr={1,1,2,2,3,4,4,4,4,4,5,6,6,7,8,8,9};
        int i=0;
        int j=1;
        int index=1;
        while(j<arr.length)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
                index++;
            }
            else
                j++;
        }
        System.out.println("Number of unique elements: "+index);
        for(int k=0;k<index;k++)
        {
            System.out.print("  "+arr[k]);
        }
    }
}
