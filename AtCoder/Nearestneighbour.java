import java.util.*;
public class NearestNeighbour{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 int i=sc.nextInt();
		 int j=sc.nextInt();
		 int min=9999;
		 int arr[]=new int[j];
		 List<Integer> li=new ArrayList<Integer>();
		 List<Integer> li1=new ArrayList<Integer>();
		 int flag=0;
		 if(j==0)
		 {
			 System.out.println(i);
			 return;
		 }
		 for(int k=0;k<j;k++)
		 {
			 arr[k]=sc.nextInt();
			 li1.add(arr[k]);
		 }
		 if(!li1.contains(i))
		 {
			 System.out.println(i);
			 return;
		 }
		 for(int k=0;k<li1.size();k++)
		 {
			 
			 if(Math.abs(i-li1.get(k))<min)
			 {
				 min=i-li1.get(k);
				 li.add(li1.get(k));
			 }
			 
		 }
		 System.out.println(li);
		 int y=li.get(li.size()-1);
		 System.out.println(y);
		 for(int k=0;k<j;k++)
		 {
			
			 if((li1.contains(i+k))&&(li1.contains(i-k)))
			 {
				 
				 continue;
			 }
			 if(!li1.contains(i-k))
			 {
				 flag=1;
				
				 System.out.println(i-k);
                 break;
				 
			 }
			 if(!li1.contains(i+k))
			 {
				 flag=1;
				 System.out.println(i+k);
                 break;
				 
			 }
			 
			 
			 
			 
			 
		 }
		 
		 
	}

}
