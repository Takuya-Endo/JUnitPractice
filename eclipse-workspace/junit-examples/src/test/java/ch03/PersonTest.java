package ch03;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private Person sut;
	
	@Before
	public void setUp() {
		
		//SetUp - 初期化
		this.sut = new Person("TestName");
		this.sut.setAge(30);
		this.sut.setEmail("TestEmail");
		
	}
	
	@Test
	public void testGetName() throws Exception {
		
		//Execute - テスト実行
		String actual = this.sut.getName();
		
		//Verify - 検証
		String expected = "TestName";
		assertThat(actual, is(expected));
		
	}
	
	@Test
	public void testGetAge() throws Exception {

		//Execute - テスト実行
		int actual = this.sut.getAge();
		
		//Verify - 検証
		int expected = 30;
		assertThat(actual, is(expected));
		
	}
	
	@Test
	public void testGetEmail() throws Exception {
		
		//Execute - テスト実行
		String actual = this.sut.getEmail();
		
		//Verify - 検証
		String expected = "TestEmail";
		assertThat(actual, is(expected));
		
	}
	
	@Test
	public void testNotNullValue() throws Exception {
		
		//Execute - テスト実行
		String actual = this.sut.getName();
		
		//Verify - 検証
		assertThat(actual, is(notNullValue()));
		
	}

}
