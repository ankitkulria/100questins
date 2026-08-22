package numbers;

import java.util.Scanner;

public class PositiveNegative {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Positive or Negative:");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("ZERO");
        else if(num>0)
            System.out.println("Positive Number");
        else if(num<0)
            System.out.println("Negative Number");
    }
}
