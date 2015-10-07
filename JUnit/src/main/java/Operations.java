/**
 * 
 */

/**
 * @author Sudhakar
 *
 */
public class Operations {

	public int getSum(int n1, int n2)
	{
		return n1+n2;
	}
	
	public int getDiff(int n1, int n2)
	{
		return n1-n2;
	}
	
	public int getProduct(int n1, int n2)
	{
		return n1*n2;
	}
	public int getDivision(int n1, int n2)
	{
		return n1/n2;
	}
	
	public int getSquare(int n1)
	{
		return n1*n1;
	}
	
	public String doConcat(String s1,String s2)
	{
		return s1.concat(s2);
	}
	
	public String doReplace(String s1,CharSequence c1, CharSequence c2)
	{
		return s1.replace(c1, c2);
	}
	
	
}
