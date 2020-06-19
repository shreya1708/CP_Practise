import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<String> li=new ArrayList<String>();
		
			String s="codeforces";
			String s1="";
		     long n=sc.nextLong();
		     if(n==1)
		     {
		    	 System.out.println(s);
		     }
		     else if(n==0)
		     {
		    	 System.out.println("No string");
		     }
		     int a[]=new int[10];
		     Arrays.fill(a,1);
		     int i=0;
		     long sum =1;
		     while(sum<n)
		     {
		    	 a[i]++;
		    	 i=(i+1)%10;
		    	 sum=1;
		    	 for(int j=0;j<10;j++)
		    	 {
		    		 sum=sum*a[j];
		    	 }
		     }
		     s="codeforces";
		     for(int k=0;k<10;k++)
		     {
		    	 for(int j=0;j<a[k];j++)
		    	 {
		    		 System.out.print(s.charAt(k));
		    	 }
		     }
		    
		     
		
     }
}
