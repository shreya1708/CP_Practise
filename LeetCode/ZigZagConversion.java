class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s==null)
        {
            return s;
        }
        char a[][]=new char[numRows][s.length()];
        for(int m=0;m<numRows;m++)
        {
            for(int n=0;n<s.length();n++)
            {
                a[m][n]='$';
            }
        }
        int k=0;
       int j=0;
        int i=0;
           fun1(s,a,numRows,k,j,i);
        String s1="";
       for(int p=0;p<a.length;p++)
       {
    	   for(int q=0;q<a[p].length;q++)
    	   {
    		   if(a[p][q]=='$')
    		   {
    			  continue;
    		   }
    		   else
    		   {
    			  s1=s1+a[p][q];
    		   }
    	   }
       }
       return s1;
        
    }
    public static void fun1(String s,char a[][],int numRows,int k,int j,int i){
        
        int flag1=0;
     for( i=0;i<numRows;i++)
            {
               if(j<s.length())
               {
                a[i][j]=s.charAt(k++);
                 
                 if(k==s.length())
                 {
                     break;
                 }
               }
               else
               {
                   flag1=1;
               }
            }
        if(flag1==1)
        {
            return;
        }
            if(k==s.length())
            {
                return;
            }
              i=i-1;
            while(i-1!=0)
            {
                
                a[--i][++j]=s.charAt(k++);
                if(k==s.length())
                {
                    break;
                }
            }
            j++;
            if(k==s.length())
            {
                return;
            }
            if(i-1==0)
            {
                fun1(s,a,numRows,k,j,0);
            }
    }
        
}
