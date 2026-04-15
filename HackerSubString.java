import java.util.Scanner;
public class HackerSubString 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int start=scn.nextInt();
        int end=scn.nextInt();
        System.out.println(s.substring(start,end));
        
    }
    
}
