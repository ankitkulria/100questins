package arrays;

public class LargestElement {
    static void main() {
        int[] arr={1,2,34,12,23,45,6,7,8,9,97,42};
//        we have to find the largest element
//        assume that arr[0] is largest
        int max=arr[0];
//        now compare with others
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest Element: "+max);
    }
}
