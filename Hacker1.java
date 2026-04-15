import java.util.Scanner;
public class Hacker1 
{
    public static void main(String[] args) 
    {
        /*Scanner scn=new Scanner(System.in);
        String A=scn.nextLine();
        String B=scn.nextLine();
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            count++;
        }
        for(int i=0;i<B.length();i++)
        {
            count++;
        }
        System.out.println(count);
        int result=A.compareTo(B);
        if(result<0)
        {
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
        String r=A+" "+B;
        char c[]=r.toCharArray();
        String e="";
        for(int i=0;i<c.length;i++)
        {
            
            if(i==0)
            {
                e=e+Character.toUpperCase(c[i]);
                

            }
            else if(c[i]==' ')
            {
                e=e+" "+Character.toUpperCase(c[++i]);
            }
            else
            {
                e=e+c[i];
            }
       
        }        
        System.out.println(e);*/
        
            Scanner sc = new Scanner(System.in);
            String A = sc.next();
            String B = sc.next();
            
            // Sum the lengths of A and B
            int count = A.length() + B.length();
            System.out.println(count);
            
            // Determine if A is lexicographically greater than B
            int result = A.compareTo(B);
            if (result < 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            
            // Capitalize the first letter in both A and B
            String resultString = A.substring(0, 1).toUpperCase() + A.substring(1) + " "
                                + B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(resultString);
    }
    
}
