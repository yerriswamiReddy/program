public class ArrayPrime 
{
    public static void main(String[] args) 
    {
        int [] b={1,2,3,4,5};
        for(int i=0;i<b.length;i++)
        {
            boolean flage=true;
            for(int j=2;j*j<=b[i];j++)
            {
                if(b[i]%j==0)
                {
                    flage=false;
                    break;
                }
            }
            if(flage==true)
            {
                System.out.println(b[i]);
            }
        }
        
    }
    
}
