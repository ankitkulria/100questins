package numbers;

public class MaxDigit {
    static void main() {
        int num=1299345;
        int max=0;
        int min=Integer.MAX_VALUE;
        while(num>0)
        {
            int digit=num%10;
            if(digit>max)
                max=digit;
            if(digit<min)
                min=digit;
            num=num/10;
        }
        System.out.println("Max Digit: "+max);
        System.out.println("Min Digit: "+min);
    }
}
