package arrays;

import java.util.Scanner;

public class InsertElementInArray {
    public static void addAtStart(int[] arr,int element)
    {
        int[] result=new int[arr.length+1];
        result[0]=element;
        for(int i=0;i<arr.length;i++)
        {
            result[i+1]=arr[i];
        }
        System.out.println("Array after inserting element at start: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+"  ");
        }
    }
    public static void addAtEnd(int[] arr,int element)
    {
        int[] result=new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            result[i]=arr[i];
        }
        result[result.length-1]=element;
        System.out.println("Array after inserting element at end: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+"  ");
        }
    }
    public static void addAtPosition(int[] arr,int position,int element)
    {
        int[] result=new int[arr.length+1];
        for(int i=0;i<position;i++)
        {
            result[i]=arr[i];
        }
        result[position]=element;
        for(int i=arr.length-1;i>=position;i--)
        {
            result[i+1]=arr[i];
        }
        System.out.println("Array after inserting element at position: ");
        System.out.println("intermediate results");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+"  ");
        }
    }
    static void main() {
        int[] arr={1,2,3,4,5,6,45,34,21,23,45,67,8,56};
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
            addAtEnd(arr,element);
        else if(choice==3)
        {
            System.out.println("Enter position(maximum position: "+(arr.length)+")");
            int position=sc.nextInt();
            addAtPosition(arr,position,element);
        }
        else
            System.out.println("Invalid Choice!!!!!");
    }
}
