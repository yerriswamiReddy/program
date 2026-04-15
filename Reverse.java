import java.util.Scanner;
/*public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the name");
        String n=scn.nextLine();
        String s2=n;
        s2.reverse();
        System.out.println();



        
    }

    
}*/

/**
 * Reverse
 */
/*public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string");
        String n=scn.nextLine();
        for(int i=n.length()-1;i>=0;i--)
        {
            char c=n.charAt(i);
            System.out.print(c);

        }
        
    }

    
}*/

/**
 * Reverse
 */
public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String n=scn.nextLine();
        char[]c=n.toCharArray();
        int i=0; int j=c.length-1;
        
        while(i<j)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;


        }
        System.out.println(c);
        
    }

    
}
