import java.util.Scanner;
/*public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1 =scn.nextLine();
        for(int i=s1.length()-1;i>=0;i--)
        {
            char c=s1.charAt(i);
            System.out.print(c);
            if(c==s1)
            {
                System.out.print("it is palndrome");
            }
            else
            {
                System.out.print("it is not a palndrome")
            }

        }


        
    }
    
}*/

/**
 * Palindrome
 */
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        System.out.println(palindrom(s1));
        
        
        
        
    }
    static boolean palindrom(String s)
        {
            char [] a=s.toCharArray();
            int i=0;int j=a.length-1;
            while(i<j)
            {
                if(a[i]!=a[j])return false;
                i++;
                j++;
            }
            return true;


        }

    
}
