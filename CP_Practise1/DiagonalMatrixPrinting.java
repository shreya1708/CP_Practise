import java.util.*;
public class  DiagonalMatrixPrinting {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int i=0;
		int j=0;
		int flag=0;
		for(int l=0;l<m.length+m[0].length-1;l++)
		{
			int b=i;
			int a=j;
			
			for(;b>=0&&a<m[0].length;a++,b--)
			{
				System.out.print(m[b][a]+" ");
			}
			if(a==m[0].length)
			{
				flag=1;
				j=j+1;
				i=m.length-1;
			}
			else if(flag==0)
			{
				i++;
				j=0;
			}
			else if(flag==1)
			{
			    j=j+1;
				i=m.length-1;
			}
		}
				
		
	}

}
