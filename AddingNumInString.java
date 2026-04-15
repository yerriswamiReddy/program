public class AddingNumInString 
{
    public static void main(String[] args) 
    {
        String s="abc12 dc13";
        int sum=0;
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='1'&&c<='9')
            {
                sum=sum*10+c-'0';

            }
            else
            {
                a=a+sum;
                sum=0;

            }
        }
        System.out.println(sum+a);
        
    }
    
}
