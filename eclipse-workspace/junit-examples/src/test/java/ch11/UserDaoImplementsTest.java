package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserDaoImplementsTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void testFindThrowsException() throws Exception {
		
		//SetUp - 初期化(Stub)
		UserDaoImplements sut = new UserDaoImplements() {
			@Override
			public User find(String userId) throws UserNotFoundException {
				throw new UserNotFoundException("UNFException");
			}
		};
		
		//Verify - 検証
		expectedException.expect(is(UserNotFoundException.class));
		expectedException.expectMessage("UNFException");
		
		//Execute - テスト実行
		User actual = sut.find("TestUserId");
		
		//Verify - 検証
		fail("No UserNotFoundException");
		
	}
	
	@Test
	public void testFind() throws Exception {
		
		//SetUp - 初期化
		UserDaoImplements sut = new UserDaoImplements();
		
		//Execute - テスト実行
		User actual = sut.find("TestUserId");
		
		//Verify - 検証
		assertThat(actual, is(notNullValue()));
		
	}

}
