package ch09;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

import ch06.UserDao;

public class UserDaoTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void testGetList1() {
		
		//SetUp - 初期化
		UserDao sut = new UserDao();
		
		//Verify - 検証
		this.expectedException.expect(UnsupportedOperationException.class);
		this.expectedException.expectMessage("未実装");
		
		//Exercise - テスト実行
		sut.getList();
		
	}
	
	@Ignore
	@Test(expected = UnsupportedOperationException.class)
	public void testGetList2() {
		//SetUp - 初期化
		UserDao sut = new UserDao();
		//Exercise - テスト実行
		sut.getList();
		//Verify - 検証
		fail("No UnsupportedOperationException");
	}

}
