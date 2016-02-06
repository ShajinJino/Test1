package tests;
import mains.*;
import static org.junit.Assert.*;  

import org.junit.After;
import org.junit.Before;
import org.junit.Test; 
public class Login_test {
	Login l=new Login();
	@Before
	public void testStaretd()
	{
		System.out.println("Test Started.");
	}

	@After
	public void testCompleted()
	{
		System.out.println("Test complete.");
	}

	@Test
	public void L_test()
	{
		
		assertEquals(true,l.test("shajin","jino"));
		System.out.println("Test 1 complete.");
		assertEquals(false,l.test1("shajin",""));
		System.out.println("Test 2 complete.");
		assertEquals(false,l.test2("shajin","fake"));
		System.out.println("Test 3 complete.");
		assertEquals(false,l.test3("fake","fake"));
		System.out.println("Test 4 complete.");
		assertEquals(false,l.test4("",""));
		System.out.println("Test 5 complete.");
	}
}
