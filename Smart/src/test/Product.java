package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Product {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("1");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void mtest() {
	prod.Product p = new prod.Product();
	assertEquals(6, p.multiply(2,3));
	
	}
	

}
