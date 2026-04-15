import java.util.Scanner;
public class CountingLetters 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        char [] s=s1.toCharArray();
        String c=" ";
        int result=0;
        for(int i=0;i<s.length;i++)
        {
            int count=0;
            for(int j=0;j<s.length;j++)
            {
                if(s[i]==s[j])
                {
                    count++;

                }
            }
            result=count;
            System.out.println(s[i]+" "+ result);
        }

        
    }

    
    
}
