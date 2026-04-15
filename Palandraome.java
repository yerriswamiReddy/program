import java.util.Scanner;
public class Palandraome 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Stirng :");
        String s1=scn.nextLine();
        System.out.println(palndrome(s1));
    }    
        static boolean palndrome(String s)
        {
            char []a=s.toCharArray();
            int i=0;
            int j=a.length-1;
            while (i<j) 
            {
                if(a[i]!=a[j])return false;
                i++;
                j--;
                
            }
            return true;

        }
        
        

        



        
    

   

    
}
