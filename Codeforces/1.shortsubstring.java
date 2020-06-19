import java.util.*;
public class shortsubstring {
	private static String s1="";
	private static String s2="";
	private static List<String> li=new ArrayList<String>();
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  Main mn=new Main();
	    while(n>=0)
	    {
		  String S1=sc.nextLine();
		  if(S1.length()==2)
		  {
			  li.add(S1);
		  }
		  s1="";
		  s2="";
		  if(S1.length()!=2)
		  {
		  mn.Ss(S1,s1,s2);
		  }
		  S1="";
		  n--;
	  }
	    for(int i=0;i<li.size();i++)
	    {
	    	System.out.println(li.get(i));
	    }
	}
	public static void Ss(String S,String s1,String s2)
	{
		for(int k=0;k<S.length();k=k+2)
		{
			s1=s1+S.substring(k,k+2);
			s1=s1+" ";
		}
	String a1[]=s1.split(" ");
	for(int a=0;a<a1.length;a++)
	{
		if(a==0)
		{
			s2=s2+a1[0];
			
		}
		else
		{
			s2=s2+a1[a].charAt(1);
		}
	}
	li.add(s2);
  }

}
