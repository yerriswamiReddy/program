public class CountingEachLitterInWord 
{
    public static void main(String[] args) 
    {
        String s1="java is easy";
        String[] s2=s1.split(" ");
        for(String temp:s2)
        {
            System.out.println(count(temp) + " " + temp);
        }
         
          
    }
    public static int count(String s)
    {
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            int count=1;
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(c==' ')
                {
                    break;
                }
                else{
                    c1=count++;
                }
            }
        }
        return c1;
    }
    
}
