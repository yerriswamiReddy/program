public class RemovingDuplicateWord 
{
    public static void main(String[] args) 
    {
        String s="happy happy birthday";
        String []s1=s.split(" ");
        
        for(String temp:s1)
        {
            System.out.print(temp);
        }
        String s2=" ";
        for(int i=0;i<s1.length;i++)
        {
            
            boolean duplicate=false;
            for(int j=i+1;j<s1.length;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    duplicate=true;
                    break;
                }
                
            }
            if(!duplicate)
            {
                s2+=s1[i]+" ";
            }
        }
        System.out.println("\n" +s2.trim());
        
        
    }
    
}
