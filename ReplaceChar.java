import java.util.Scanner;
/*public class ReplaceChar 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        char [] a=s1.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]=='a')
            {
               a[i]='@' ;
            }
            System.out.print(a[i]);
        }    

                
    }


    
}*/
/**
 * ReplaceChar
 */
/*public class ReplaceChar 
{
    public static void main(String[] args) 
    {
        String s1="ramana";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a')
            {
                c='@';
            }
            System.out.print(c);
        }
        
    }

    
}*/
/**
 * ReplaceChar
 */
public class ReplaceChar 
{
    public static void main(String[] args) 
    {
        String s1="ramana";
        String r=s1.replace('a', '@');
        System.out.println(r);
        
    }

    
}
