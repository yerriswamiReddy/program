public class HackerAnagram 
{
    public static void main(String[] args) 
    {
        if(anagaram("ramu","raju")==true)
        {
            System.out.println("Anagrams");

        }
        else{
            System.out.println("Not Anagrams");
        }
        
    }
    public static boolean anagaram (String s1,String s2)
    {
        while (s1.length()==s2.length()) 
        {
            if(s1.length()==0 && s2.length()==0)return true;
            char c=s1.charAt(0);
            s1=s1.replace(c+"", "");
            s2=s2.replace(c+"", "");
            
        }
        return false;

    }
        
    
    
}
/* another type
    // Complete the function
    a = a.toLowerCase();
    b = b.toLowerCase();

    char[] charArrayA = a.toCharArray();
    char[] charArrayB = b.toCharArray();

    java.util.Arrays.sort(charArrayA);
    java.util.Arrays.sort(charArrayB);

    return java.util.Arrays.equals(charArrayA, charArrayB);
 */
