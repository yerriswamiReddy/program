import java.io.*;
import java.util.*;
public class HackerToken 
{
    /*public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String []s1=s.split(" [,_ '!?.@]+ ");
        System.out.println(s1.length);
        for(String  r:s1)
        {
            if(r!=" ")
            {
                System.out.println(r);

            }
            
        }
       


        
    }*/

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String array[] = s.split("[,_ '!?.@]+");
        System.out.println(array.length);
    for (String string : array) 
    {
        if(string!=" ")
        {

        System.out.println(string);
        }
        scan.close();
    }
    }
    
}
/*  
public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String array[] = s.split("[,_ '!?.@]+");
        System.out.println(array.length);
    for (String string : array) 
    {
        if(string!=" ")
        {

        System.out.println(string);
        }
        scan.close();
    }
    }
 */
