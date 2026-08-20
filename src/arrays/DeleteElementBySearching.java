package arrays;

public class DeleteElementBySearching {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=2;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                arr[i]=0;
                index=i;
                break;
            }
        }
        if(index>=0)
        {
            for(int i=index;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(" "+arr[i]);
            }
        }
        else
            System.out.println("\nElement not found");
    }
}
