package numbers;

import java.util.Scanner;

public class SumofFirstNnumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int num=sc.nextInt();
        int sum=(num*(num+1))/2;
        System.out.println("Sum of First "+num+" numbers: "+sum);
    }
}
