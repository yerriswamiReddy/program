public class ReverseNumber 
{
    public static void main(String[] args)
    {
        int num=125;
        int temp = 0;
        while(num>0)
        {
            int sum=num%10;
            temp=temp*10+sum;
            num/=10;
            
        }
        
        System.out.println(temp);
    }
    
}
