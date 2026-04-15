public class ReplaceVowlesWithSpaceCount3
{
    public static void main(String[] args) 
    {
        String s="yerriswami reddy";
        char []s1=s.toCharArray();
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            char c=s1[i];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
               count++;
            }
            if(count>=3)
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    s1[i]='_';
                }

            }
        }
        System.out.println(s1);
        
    }
}
