public class Perminitation
{
    public static void main(String[] args) 
    {
        perminitation("abc", 0, 2);

        
    }
    public static void perminitation(String s,int start,int end)
    {
        if(start>=end)
        {
            System.out.println(s);
            return;

        }
        
        for(int i=start;i<end;i++)
        {
            
            String s1=swap(s,start,i);
            System.out.println(s1);
            perminitation(s1,start+1,end);

        }

    }
    public static String swap(String s,int i,int j)
    {
        char[]c=s.toCharArray();
        char temp=c[i];
        c[i]= c[j];
        c[j]=temp;
        return new String(c);
    }
       
    
}
