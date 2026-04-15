import java.util.Scanner;
public class Every1LetCap 
{
    public static void main(String[] args) 
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the String :");
        String s1=scn.nextLine();
        
        char [] a=s1.toCharArray();
        String e="";
        for(int i=0;i<a.length;i++)
        {
            
            if(i==0)
            {
                e=e+Character.toUpperCase(a[i]);
                

            }
            else if(a[i]==' ')
            {
                e=e+" "+Character.toUpperCase(a[++i]);
            }
            else
            {
                e=e+a[i];
            }
        }
        
        System.out.println(e);
    }

   

    
}
// another logic
/*if (i == 0 || (i > 0 && c[i - 1] == ' ')) 
            {
                c[i] = Character.toUpperCase(c[i]);

            }*/
