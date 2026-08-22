package numbers;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd:");
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
