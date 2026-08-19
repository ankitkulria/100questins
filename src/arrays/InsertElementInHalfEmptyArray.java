package arrays;

import java.util.Scanner;

public class InsertElementInHalfEmptyArray {
    public static void addAtStart(int[] arr,int element)
    {
        for(int i=arr.length-1;i>=1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=element;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("  "+arr[i]);
        }
        System.out.println();
    }
    public static void addAtEnd(int[] arr,int element,int present)
    {
        arr[present]=element;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
    public static void addAtPosition(int[] arr,int element,int position)
    {
        for(int i=arr.length-1;i>=position;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[position]=element;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("  "+arr[i]);
        }
    }

    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,0,0,0,0,0,0,0,0};
//        addAtStart(arr,77);
//        addAtEnd(arr,77,8);
//        addAtPosition(arr,777,8);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to insert");
        int element=sc.nextInt();
        System.out.println("Choose position:");
        System.out.println("1-> Start");
        System.out.println("2->End");
        System.out.println("3->Specific Position");
        int choice=sc.nextInt();
        if(choice==1)
            addAtStart(arr,element);
        else if (choice==2)
            addAtEnd(arr,element,8);
        else if(choice==3)
        {
            System.out.println("Enter position(maximum position: "+(arr.length)+")");
            int position=sc.nextInt();
            addAtPosition(arr,element,position);
        }
        else
            System.out.println("Invalid Choice!!!!!");
    }
}
