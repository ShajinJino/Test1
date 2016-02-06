package test;
import main.*;
import static org.junit.Assert.*;  

import org.junit.Test; 
public class Login_test {
	@Test
	public void L_test()
	{
		
		assertEquals(true,Login.test("shajin","jino"));
		assertEquals(false,Login.test1("shajin",""));
		assertEquals(false,Login.test2("shajin","fake"));
		assertEquals(false,Login.test3("fake","fake"));
		assertEquals(false,Login.test4("",""));
	}
}
