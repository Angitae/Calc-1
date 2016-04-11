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

	@Test
	public void testMul() {
		SimpleCalculatior calc = new SimpleCalculatior();
		calc.mul(10, 20);
		assertEquals(200, calc.getResult());
	}

	
	@Test
	public void testDiv() {
		SimpleCalculatior calc = new SimpleCalculatior();
		calc.div(100, 20);
		assertEquals(5, calc.getResult());

		
	}
	@Test
	public void testInc() {
		SimpleCalculatior calc = new SimpleCalculatior();
		calc.inc(100);
		assertEquals(100, calc.getResult());
		calc.inc(200);
		assertEquals(300, calc.getResult());
		}

}
