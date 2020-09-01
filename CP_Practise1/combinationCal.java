import java.util.*;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

import java.math.BigInteger;
public class combinationCal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=sc.nextInt();
	    String s=String.valueOf(n);
	    String s1=String.valueOf(c);
        BigInteger bg=new BigInteger(s);
        BigInteger bg1=new BigInteger(s1);
        int b=bg1.intValue();
        BigInteger bi = BigInteger.ONE;
        BigInteger bi3=new BigInteger("1");
        for(int i=0;i<b;i++)
        {
        	bi=bi.multiply(bg.subtract(BigInteger.valueOf(i)));
            bi=bi.divide(bi3.add(BigInteger.valueOf(i)));
        }
       System.out.println(bi);
	}

}
