import java.util.*;

public class EvenArray{
	private static Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	private static Map<Integer,Integer> mp1=new HashMap<Integer,Integer>();
	private static List<Integer> li=new ArrayList<Integer>();
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	    while(n>0)
	    {
	    	int n1=sc.nextInt();
	    	
	    	int arr[]=new int[n1];
	    	
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		arr[i]=sc.nextInt();
	    	}
	    	if(n1==1)
	    	{
                    if(arr[0]%2==0)
                   {
                       li.add(0);
                   }
                   else
                  {
                        li.add(-1);
                   }

	    	}
	    	else
	    	{
	    	
		    Ss1(arr,li);
	    	}
		    n--;
		    
	    	
	    }
	    
	    for(int k=0;k<li.size();k++)
	    {
	    	System.out.println(li.get(k));
	    }
	    sc.close();
	}
	public static void Ss1(int arr[],List<Integer> li)
	{
		int b[]=new int[arr.length];
		int c[]=new int[arr.length];
		int count=0;
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=i%2;
		}
		for(int i=0;i<arr.length;i++)
		{
			c[i]=arr[i]%2;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(b[i]==c[i])
			{
				count++;
			}
		}
		if(count==arr.length)
		{
			li.add(0);
			return ;
		}
		else
		{
			swap(b,c);
		}
	}
	public static void swap(int b[],int c[])
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==c[i])
			{
				continue;
			}
			else
			{
				if(mp.containsKey(b[i]))
				{
					mp.put(b[i],mp.get(b[i])+1);
				}
				else
				{
					mp.put(b[i], 1);
				}
				if(mp1.containsKey(c[i]))
				{
					mp1.put(c[i],mp1.get(c[i])+1);
				}
				else
				{
					mp1.put(c[i], 1);
				}
				
			}
		}
		if(mp.equals(mp1))
		{
			int sum=0;
			Set<Map.Entry<Integer, Integer>> st=mp.entrySet();
			for(Map.Entry<Integer, Integer> st1:st)
			{
				sum=sum+st1.getValue();
			}
			int y=sum/2;
			li.add(y);
			mp.clear();
			mp1.clear();
			
		}
		else
		{
			 li.add(-1);
			 mp.clear();
			 mp1.clear();
				
		}
	
	
		
	}
	}
