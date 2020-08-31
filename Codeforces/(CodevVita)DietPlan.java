import java.util.*;
import java.io.*;
public class DietPlan {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String s8=sc.nextLine();
	     System.out.println(s8);
	    String brr[]=s8.split(" ");
	    int p=Integer.parseInt(brr[0].substring(0,brr[0].length()-1));
	    int c=Integer.parseInt(brr[1].substring(0,brr[1].length()-1));
	    int f=Integer.parseInt(brr[2].substring(0,brr[2].length()-1));
	
		String s9="10p 20c 30f|20p 30c 20f";
		
	    String arr[]=s9.split("\\|");
	 
		int total=p+c+f;
		System.out.println(total);
		int sum=0;
		int a1[][]=new int[arr.length][4];
		int a2[]=new int[arr.length];
			
			for(int i=0,l=0;i<arr.length&&l<a1.length;i++,l++)
			{
				String s1=arr[i];
				int a=0;
				String s2="";
				int w=0;
				while(a<s1.length())
				{
					if(s1.charAt(a)=='p'||s1.charAt(a)=='c'||s1.charAt(a)=='f')
					{
						int q=Integer.parseInt(s2);
						a1[l][w++]=q;
						a2[l]+=q;
						s2="";
					}
					else if(s1.charAt(a)==' ')
					{
						a++;
						continue;
					}
					else
					{
					s2=s2+s1.charAt(a);
					
					}
					a++;
					
				}
				a1[l][w++]=a2[l];
				s1="";
				
			}
			Arrays.sort(a1, new Comparator<int[]>() { 
	            
		          @Override              
		          // Compare values according to columns 
		          public int compare(final int[] entry1,  
		                             final int[] entry2) { 
		  
		            // To sort in descending order revert  
		            // the '>' Operator 
		            if (entry1[3] >entry2[3]) 
		                return -1; 
		            else
		                return 1; 
		          } 
		        });
		  int y[]=new int[arr.length];
		  int b[]=new int[3];
		  Arrays.fill(b, 0);
		  int d=1;
		  int flag=0;
		  int flag4=0;
		  int flag3=0;
	      while(sum<total)
	      { 
	    	  int i=0;
	    	  flag=0;
	    	  flag3=0;
	    	  int count=0;
	    	  for(;i<a1.length;i++)
	    	  {  
	    		    if(b[0]+a1[i][0]<=p&&b[1]+a1[i][1]<=c&&b[2]+a1[i][2]<=f)  
	    			  {
	    		    	flag=1;
	    		    	if(sum+a1[i][0]+a1[i][1]+a1[i][2]>total)
                         {
                        	 flag3=1;
                        	 break;
                         }
	    		    	b[0]+=a1[i][0];
	    		    	b[1]+=a1[i][1];
	    		    	b[2]+=a1[i][2];
	    		    	sum=sum+a1[i][0]+a1[i][1]+a1[i][2];
	    		    
	    			  }
	    		    else
	    		    {
	    		    	
	    		    	if(sum+a1[i][0]+a1[i][1]+a1[i][2]>total)
                        {
	    		    
                       	 flag3=1;
                       	 break;
                        }
	    		    	
	    		    	if(b[0]+a1[i][0]>=p||b[1]+a1[i][1]>=c||b[2]+a1[i][2]>=f)  
		    			  {
	    		    		count++;
	    		    	continue;
		    			  }
	    		    }
	    		  
	    		  if(sum==total)
	    		  {
	    			  flag=1;
	    			  break;
	    		  }
	    		  if(sum<total)
	    		  {
	    			 
	    			  y[i]++;
	    			 
	    		  }
	    	  }
	    	  if(flag3==1||count==a1.length)
	    	  {
	    		  break;
	    	  }
	    	  
	      }
	      int totalp=0;
	      int totalc=0;
	      int totalf=0;
	      for(int i=0;i<y.length;i++)
	      {
	    	  System.out.println(y[i]);
	      }
	      for(int e=0;e<y.length;e++)
	      {
	    	      totalp=totalp+a1[e][0]*y[e];
	    	  
	      }
	      for(int e=0;e<y.length;e++)
	      {
	    	      totalc=totalc+a1[e][1]*y[e];
	    	  
	      }
	      for(int e=0;e<y.length;e++)
	      {
	    	      totalf=totalf+a1[e][2]*y[e];
	    	  
	      }
	      System.out.println(totalp+" "+totalc+" "+totalf);
	      System.out.println((p-totalp)+"P"+(c-totalc)+"C"+(f-totalf)+"F");
			
		}
		
	
		
		
	

}
