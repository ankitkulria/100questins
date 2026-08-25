package numbers;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float radius=sc.nextFloat();
        double area=3.14*radius*radius;
        System.out.println("Area of circle: "+area);
    }
}
