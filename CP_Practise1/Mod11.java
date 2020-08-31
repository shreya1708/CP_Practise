import java.util.*;
import java.math.BigInteger;
public class Mod11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int p=remainderMod11(s);
		System.out.println(p);
		
	}
	public static int remainderMod11(String s)
	{
		BigInteger a=new BigInteger(s);
	    BigInteger b =a.mod(new BigInteger("11"));
		int u=b.intValue();
		return u;
	}
}
