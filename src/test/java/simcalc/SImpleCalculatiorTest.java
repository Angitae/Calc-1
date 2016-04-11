package simcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class SImpleCalculatiorTest {

	@Test
	public void testAdd() {
		SimpleCalculatior calc = new SimpleCalculatior();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
		
	}
	
	@Test
	public void testSub() {
		SimpleCalculatior calc = new SimpleCalculatior();
		calc.sub(10, 20);
		assertEquals(-10, calc.getResult());
		
	}

}
