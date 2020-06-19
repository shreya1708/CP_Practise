import java.util.*;
public class C{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> li=new ArrayList<Integer>();
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			int count=0;
                        if(a==0&&b==0&&n>0)
			{
				li.add(0);
				continue;
			}
			if(n<a&&n<b)
			{
				li.add(0);
				continue;
			}
			while(a<=n&&b<=n)
			{
				if(a<=b)
				{
				if(a<=n)
				{
					count++;
					a=a+b;
					if(a>n)
					{
					    li.add(count);
					    break;
					}
				}
				 if(b<=n)
				{
					count++;
					b=b+a;
					if(b>n)
					{
						li.add(count);
						break;
					}
				}
				}
				else
				{
					 if(b<=n)
						{
							count++;
							b=b+a;
							if(b>n)
							{
								li.add(count);
								break;
							}
						}
					 if(a<=n)
						{
							count++;
							a=a+b;
							if(a>n)
							{
							    li.add(count);
							    break;
							}
						}
					 
				}
			}
			
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}
