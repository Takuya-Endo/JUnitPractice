package ch06;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class UserDaoTest {

	public static class UserList0 {
		
		//SUT - テスト対象システム
		private UserDao sut;
		
		@Before
		public void setUp() {
			
			//SetUp - 初期化
			this.sut = new UserDao();

		}
		
		//Verify - 検証
		@Test(expected = UnsupportedOperationException.class)
		public void testGetList() {
			
			//Execute - テスト実行
			List<User> actual = this.sut.getList();
			
			//Verify - 検証
			fail("No UnsupportedOperationException");
			
		}
		
	}
	
	public static class UserList3 {
	
		//SUT - テスト対象システム
		private UserDao sut;
		
		@Before
		public void setUp() {
			
			//SetUp - 初期化
			this.sut = new UserDao();
			this.sut.setList("UserA");
			this.sut.setList("UserB");
			this.sut.setList("UserC");

		}
		
		@Test
		public void testGetList() {
			
			//Execute - テスト実行
			List<User> actual = this.sut.getList();
			
			//Verify - 検証
			int expected = 3;
			assertThat(actual, is(notNullValue()));
			assertThat(actual.size(), is(expected));
			
		}
		
	}
	
}
