public class CountEvenOrOdd 
{
    public static void main(String[] args)
    {
        int num=10;
        int even=0;
        int odd=0;
        for(int i=1;i<=10;i++)
        {
            int count=0;
            if(i%2==0)
            {
                count++;
                even+=count;
            }
            else
            {
                count++;
                odd+=count;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    
}
