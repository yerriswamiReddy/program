import java.util.Scanner;
public class SubStringPalandrome 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String s =scn.nextLine();
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(ispandrome(s,i,j))
                {
                    System.out.println(s.substring(i,j+1));
                }
            }
        }

        
    }
    public static boolean ispandrome(String a,int start,int end)
    {
        int i=start;
        int j=end;
        char[]s=a.toCharArray();
        
        while(i<j)
        {
            if(s[i]!=s[j])return false;
            i++;
            j--;


        }
        return true;
        
    }
    
}
