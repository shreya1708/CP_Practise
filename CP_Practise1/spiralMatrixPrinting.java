import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int e=sc.nextInt();
		int f=sc.nextInt();
		int m[][]=  new int[e][f];
		  for(int i=0;i<e;i++)
		  {
		      for(int j=0;j<f;j++)
		      {
		          m[i][j]=sc.nextInt();
		      }
		  }
		int right=0;
		int left=0;
		int up=m[0].length;
		int down =m.length;
		int flag=0;
		int flag1=1;
		int count=0;
		int x=up*down;
		while(right<up&&left<down)
		{
			int i=0;
			 flag=0;
			 flag1=0;
			for( i=right;i<up;i++)
			{
					if(count==x)
				{
				    break;
					}
				System.out.print(m[left][i]+" ");
				count++;
				flag1=1;
			}
			int j=0;
			for(j=left+1;j<down;j++)
			{
			        if(count==x)
			        {
			            break;
			        }
					System.out.print(m[j][up-1]+" ");
					count++;
					flag=1;
			
			}
			//System.out.println(i+"hello"+up+" break"+j+"heyaa"+down);
			if(i==up&&j==down&&flag==1&&flag1==1)
			{
				int p=0;
				//System.out.println("hii"+right+" "+(down-1));
				for( p=up-1-1;p>right;p--)
				{
				    if(count==x)
				    {
				        break;
				    }
						System.out.print(m[down-1][p]+" ");	
						count++;
				}
				//i=p+1//
				int q=0;
				for( q=down-1;q>left;q--)
				{
				    if(count==x)
				    {
				        break;
				    }
			           count++;
						System.out.print(m[q][right]+" ");
					
				}
			}
			
			up=up-1;
			down=down-1;
			left++;
			right++;
		}
		System.out.println();
	}
	}
}		
						 
