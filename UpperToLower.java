import java .util.Scanner;
public class UpperToLower 
{
    public static void main(String[] args) 
    {
        Scanner scn= new Scanner (System.in);
        System.out.print("Enter the string :");
        String s=scn.nextLine();
        String s1=" ";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A'&&c<='Z')
            {
                s1=s1+Character.toLowerCase(c);
            }
            else
            {
                s1+=c;
            }
        }
        System.out.println(s1); 
        
    }
    

    
}
