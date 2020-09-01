import java.util.*;
public class BinarySearchMatrix {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int s=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		searchM(arr,s);
	}
	public static void searchM(int arr[][],int s)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int y=BinSearch(arr[i],s);
			if(y>0)
			{
				System.out.println("the element is found at index"+(i)+" "+y);
				break;
			}
			else
			{
				continue;
			}
		}
	}
	public static int  BinSearch(int a[],int s)
	{
		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(a[mid]==s)
			{
				return mid;
			}
			else if(s>a[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

}
