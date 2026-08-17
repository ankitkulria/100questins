package arrays;

public class SearchElementInArray {
    static void main() {
        int[] arr={1,4,2,5,67,34,21,45,8,9};
        int target=34;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
            }
        }
        System.out.println("Element found at index: "+index);
    }
}
