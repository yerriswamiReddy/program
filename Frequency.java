public class Frequency
{
    public static void main(String[] args)
    {
        String s="ramu";
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                char r=s.charAt(j);
                if(c==r)
                {
                    count++;
                }
            }
            for(int k=0;k<i;k++)
            {
                if(s.charAt(k)==c)
                {
                    break;
                }
            }
        }
        
    }
}