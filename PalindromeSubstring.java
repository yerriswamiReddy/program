public class PalindromeSubstring  
{
    public static void main(String[] args)
    {
        String a="banana";
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<a.length();j++)
            {
                if(ispallondrom(a,i,j))
                {
                    System.out.println(a.substring(i,j+1));
                }
            }
        }

    }
    public static boolean ispallondrom(String s,int start,int end)
    {
        int i=start; int j=end;
        char [] c=s.toCharArray();
        while(i<j)
        {
            if(c[i]!=c[j])return false;
            i++;
            j--;

        }
        return true;
    }
    
}
