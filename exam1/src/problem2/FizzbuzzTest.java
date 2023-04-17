package problem2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzbuzzTest {
	
	Fizzbuzz fb;
	@Before
	public void setUp() throws Exception {
		fb = new Fizzbuzz();
	}

	@After
	public void tearDown() throws Exception {
		fb = null;
	}
	@Test
	public void testFizzBuzzMethodValid() {
		String output = fb.fizzBuzzMethod(15);
		assertEquals(" fizz buzz fizz buzz fizz", output);
	}
   
	@Test
	public void testFizzBuzzMethodLessThani() {
		String output = fb.fizzBuzzMethod(0);
		assertEquals("", output);
	}
   
	@Test
	public void testFizzBuzzMethodForNumEqualsOne() {
      
		String output = fb.fizzBuzzMethod(1);
		assertEquals("", output);
	}
   
	@Test
	public void testFizzBuzzMethodForNumDivisibleBy5() {
      
		String output = fb.fizzBuzzMethod(5);
		assertEquals(" fizz", output);
	}
   
	@Test
	public void testFizzBuzzMethodForNumDivisibleBy7() {
      
		String output = fb.fizzBuzzMethod(7);
		assertEquals(" fizz buzz", output);
	}
   
	@Test
	public void testFizzBuzzMethodForNumDivisibleBy5And7() {
      
		String output = fb.fizzBuzzMethod(35);
		assertEquals(" fizz buzz fizz buzz fizz fizz buzz fizz buzz fizz fizzbuzz", output);
	}

}
