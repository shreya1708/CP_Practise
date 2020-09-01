import java.util.*;
public class spiralMatrix {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m[][]=  { {1,  2,  3,  4,  5},
		        {6, 7,  8,  9,  10},
		        {11, 12, 13, 14, 15},
		        {16, 17, 18, 19, 20}
		    };
		int right=0;
		int left=0;
		int up=m[0].length;
		int down =m.length;
		int flag=0;
		int flag1=1;
		while(right<up&&left<down)
		{
			int i=0;
			 flag=0;
			 flag1=0;
			for( i=right;i<up;i++)
			{
				System.out.print(m[left][i]+" ");
				flag1=1;
			}
			
			int j=0;
			for(j=left+1;j<down;j++)
			{
			     
					System.out.print(m[j][up-1]+" ");
					flag=1;
			
			}
			//System.out.println(i+"hello"+up+" break"+j+"heyaa"+down);
			if(i==up&&j==down&&flag==1&&flag1==1)
			{
				int p=0;
				//System.out.println("hii"+right+" "+(down-1));
				for( p=up-1-1;p>right;p--)
				{
						System.out.print(m[down-1][p]+" ");	
				}
				//i=p+1//
				int q=0;
				for( q=down-1;q>left;q--)
				{
			
						System.out.print(m[q][right]+" ");
					
				}
			}
			
			up=up-1;
			down=down-1;
			left++;
			right++;
		}
	}

}
