public class ReplaceVowlesWithSpaceCount__3  
{
    public static void main(String[] args) 
    {
        String s="rajesh";
        String s1[]=s.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            char c=s1[i];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println(c);
            }
        }
        
    }
    
}
