public class ProblemCompareTo 
{
    public static void main(String[] args) 
    {
        String s="hello rajesh hello  rajesh";
        String []r=s.split(" ");
        String e=" ";
        for(int i=0;i<r.length-1;i++)
        {
            for(int j=i+1;j<r.length;j++)
            {
                if(r[i].compareTo(r[j])==0)
                {
                    e=e+r[i]+" ";

                }
            }
        }
        System.out.println(e);
        
    }
    
}
/* 
 public class ProblemCompareTo {
    public static void main(String[] args) {
        String s = "hello rajesh hello";
        String[] r = s.split(" ");
        String e = "";
        for(int i = 0; i < r.length; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++) {
                if(r[i].compareTo(r[j]) == 0) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                e += r[i] + " ";
            }
        }
        System.out.println(e);
    }
}

*/