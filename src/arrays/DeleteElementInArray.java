package arrays;

public class DeleteElementInArray {
    public static void deleteStart(int[] arr,int target)
    {
        if(target==arr[0])
        {
            arr[0]=0;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
    public static void deleteEnd(int[] arr,int target)
    {
        if(arr[arr.length-1]==target)
        {
            arr[arr.length-1]=0;
        }
    }
    public static void deletePosition(int[] arr,int target, int position)
    {
        for(int i=position;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,12,13};
        int target=6;
        System.out.println("RAW Array:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter Position of element to be deleted:");
        System.out.println();
        System.out.println("Array after deletion:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
