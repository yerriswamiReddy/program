import java.util.Scanner;
public class HackerSubStringasc 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int k=scn.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
     
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String list[] = new String[s.length()-k+1];

    for(int i=0; i < s.length()-k+1 ; i++) {

        String temp = s.substring(i,i+k); 
        list[i] = temp;
    }
    java.util.Arrays.sort(list);

    System.out.println(list[0]);
    System.out.println(list[list.length-1]);
        
        return smallest + "\n" + largest;
    }

    

    
}
