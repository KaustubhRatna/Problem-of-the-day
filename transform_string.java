import java.util.*;
public class transform_string
 {
     public static int find_distance(String s,char ch)
     {
         int min=1000,temp;
         int l=s.length();
         for(int i=0;i<l;i++)
         {
             char gc=s.charAt(i);
             if(Math.abs((int)gc-(int)ch)>13)
             temp=26-Math.abs((int)gc-(int)ch);
             else
             temp=Math.abs((int)gc-(int)ch);

             if(temp<min)
             min=temp;        
         }
                return min;
            }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input test cases");
        int T=sc.nextInt();
        String q=sc.nextLine();
        while(T>0)
        {
        System.out.println("input a string ");
        String S=sc.nextLine();
        System.out.println("input favourite string");
        String F=sc.nextLine();
        int sum=0;
        for(int i=0;i<S.length();i++)
        {
            sum+=find_distance(F, S.charAt(i));
        }
        System.out.println(sum);
        T=T-1;;
        }    
    }
}
