public class AddingAsciiValue 
{
    public static void main(String[] args) 
    {
        String s="abc";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='a'&&c<='z')
            {
                sum=sum+c;

            }
        }
        System.out.println(sum);
        
    }
    
}
