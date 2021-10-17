package org.dasees.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.dasees.PerfectNumber;
import org.dasees.PerfectNumberResource;
import org.junit.Test;
/**
 * This Junit clas is used to unit test the perfect numbers functionality
 * @author Dasees Gupta
 *
 */
public class PerfectNumberTest {
	
	/**
	 * This method is used to test if given number is perfect number or not 
	 */
	@Test
		public void testCheckPerfectNumber()
	{
		
		PerfectNumberResource prn=new PerfectNumberResource();
		assertEquals(Boolean.TRUE, prn.checkPerfectNumber(6));
		assertEquals(Boolean.FALSE, prn.checkPerfectNumber(-10));
		assertEquals(Boolean.FALSE, prn.checkPerfectNumber(0));
		assertEquals(Boolean.FALSE, prn.checkPerfectNumber(50));
	}
	
	/**
	 * This method is used to test the list of perfect numbers within a given range
	 */
	@Test
	public void testListOfPerfectNumber()
	{
		PerfectNumber pn1 = new PerfectNumber();
		PerfectNumber pn2 = new PerfectNumber();
		pn1.setPerfectnumber(6);
		pn2.setPerfectnumber(28);
		
		
		PerfectNumberResource prn=new PerfectNumberResource();
		List<PerfectNumber> perfectnumberlist=prn.getListOfPerfectNumbers(-100,1000);
		
		assertTrue( !perfectnumberlist.isEmpty());
        assertEquals(pn1.getPerfectnumber(), perfectnumberlist.get(0).getPerfectnumber());
        assertEquals(pn2.getPerfectnumber(), perfectnumberlist.get(1).getPerfectnumber());
        
	}
	/**
	 * This method is used to test if there is not perfect number within a provided range of numbers
	 */
	@Test
	public void testEmptyListOfPerfectNumber1()
	{
		
		PerfectNumberResource prn=new PerfectNumberResource();
		List<PerfectNumber> perfectnumberlist=prn.getListOfPerfectNumbers(-100,0);
		
		assertTrue( perfectnumberlist.isEmpty());
        
	}
	/**
	 * This method is used to test if there is not perfect number within a provided range of numbers. Here
	 * [x,y], x>y
	 */
	@Test
	public void testEmptyListOfPerfectNumber2()
	{
		
		PerfectNumberResource prn=new PerfectNumberResource();
		List<PerfectNumber> perfectnumberlist=prn.getListOfPerfectNumbers(100,0);
		
		assertTrue( perfectnumberlist.isEmpty());
        
	}
}
