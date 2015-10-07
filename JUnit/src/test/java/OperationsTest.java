import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.AfterClass;
import org.junit.Before;
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
	
	
	Operations operations;
	
	@Before
	public void setup() {
		// TODO Auto-generated method stub
		 operations=new Operations();
	}
	
	
	@Test
	public void testAssertions()
	{
		assertEquals("They are not equal", 5, operations.getSum(2, 3));
		assertArrayEquals("Bytes are not same", operations.getBytes("test"), operations.getBytes("test"));
		assertFalse("4 is not greater than 5",4>5);
		assertNotEquals("Values are same",7, operations.getSum(2, 3));
		assertTrue(4<5);
		assertSame("Objects are not same","", "");
		assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), CoreMatchers.everyItem(CoreMatchers.containsString("n")));
		
		assertNull("Null not passed", null);
		
		assertNotNull("Null passed","");
		
	}
	

	@Test
	public void testgetSum() {
		
		assertEquals(5, operations.getSum(2, 3));
	}
	
	@Test
	public void testgetDiff() {
		
		assertEquals(-1, operations.getDiff(2, 3));
	}
	
	

}
