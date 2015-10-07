import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Sudhakar
 *
 */
public class OperationsTest {
	
	Operations operations=null;
	
	@BeforeClass
	public void  setup() {
		// TODO Auto-generated method stub
		operations=new Operations();
	}

	@Test
	public void testgetSum() {
		assertEquals(5, operations.getSum(2, 3));
	}
	
	@AfterClass
	public void tearDown()
	{
		operations=null;
		System.gc();
	}

}
