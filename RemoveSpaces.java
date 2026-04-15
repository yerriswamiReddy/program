public class RemoveSpaces
{
    public static void main(String[] args) 
    {
        String s1="   Ramu rajesh";
        String c1="";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c!=' ')
            {
                c1 += c;
            }
        }
        System.out.println(c1);
    }
    
}
