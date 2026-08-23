package numbers;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second number:");
        int num2=sc.nextInt();
        System.out.println("Enter Third number:");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println(num1+" is greater");
        else if(num2>num1 && num2>num3)
            System.out.println(num2+" is greater");
        else if(num3>num1 && num3>num2)
            System.out.println(num3+" is greater");
        else
            System.out.println("All are equal");
    }
}
