public class Count
{
    public static void main(String[] args)
    {
        int count=0;
        int num=121;
        while(num>0)
        {
            count++;
            num/=10;
        }
        System.out.println(count);
    }
    
}
