package ch03;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserFormTest {

	@Test
	public void testIsValidTrue() throws Exception {
		
		//SetUp
	    String userName = "TestName";
	    String password = "TestPass";
		UserForm sut = new UserForm(userName, password);
		
		//Exercise
		boolean actual = sut.isValid();
		
		//Verify
		boolean expected = true;
//		assertThat(actual, is(expected));
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testIsValidFalse() throws Exception {
		
		//SetUp
		String userName = "";
	    String password = "TestPass";
		UserForm sut = new UserForm(userName, password);
		
		//Exercise
		boolean actual = sut.isValid();
		
	}

}
