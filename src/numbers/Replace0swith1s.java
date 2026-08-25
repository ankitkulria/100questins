package numbers;

public class Replace0swith1s {
    static void main() {
        int num=10203040;
        System.out.println("Original number: "+num);
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            if(digit==0)
                digit=1;
            rev=rev*10+digit;
            num=num/10;
        }
        int newnum=0;
        while(rev>0)
        {
            int digit=rev%10;
            newnum=newnum*10+digit;
            rev=rev/10;
        }
        System.out.println("The new number with 1s at the place of 0s: "+newnum);
    }
}
