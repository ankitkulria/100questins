package arrays;

public class SumOfElements {
    static void main() {
        int[] arr={1,2,3,5,6,7,34,23,11,10,19,91,98};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of Elements: "+sum);
    }
}
