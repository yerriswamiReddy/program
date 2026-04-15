import java.util.Scanner;
public class ConvertingLetters 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) 
        {
            char c = s1.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                s2 = s2 + Character.toLowerCase(c);
            }
            if (c >= 'a' && c <= 'z') {
                s2 = s2 + Character.toUpperCase(c);
            }
        }
        System.out.println(s2);

        
    }
    
}
