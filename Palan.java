public class Palan 
{
    public static void main(String[] args)
    {
        int num=121;
        int num1=num;
        int temp=0;
        while(num>0)
        {
            int rem=num%10;
            temp=temp*10+rem;
            num/=10;
        }
        if(temp==num1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
