package ch03;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class UserFormTest {

	@Test
	public void testIsValid() throws Exception {
		
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
	public void testGetErrorMessage() throws Exception {
		
		//SetUp
		String userName = "";
	    String password = "TestPass";
		UserForm sut = new UserForm(userName, password);
		
		//Exercise
		String actual = sut.getErrorMessage();
		
		//Verify
		String expected = "ユーザIDは必須項目です。";
//		assertEquals(expected, actual);
		assertThat(actual, is(expected));
		//それぞれstaticインポートが必要
		//import static org.junit.Assert.*;
		//import static org.hamcrest.CoreMatchers.*;
		
	}

}
