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

}
