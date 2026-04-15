import java.util.Scanner;
/*public class FindingIndex 
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        int a=scn.nextInt();
        char c=s1.charAt(a);
        System.out.println(c);

        

    }
    
}*/

/**
 * FindingIndex
 */
public class FindingIndex 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        System.out.print("Enter the letter :");
        String c=scn.next();
        System.out.println(s1.indexOf(c));

        
    }

    
}

