package ch03;

import org.junit.Test;

public class ExceptionThrownTest {

	//Verify - 検証
	@Test(expected = IllegalArgumentException.class)
	public void testDoSomething() throws Exception {
		
		//SetUp - 初期化
		ExceptionThrown sut = new ExceptionThrown();
		
		//Exercise - テスト実行
		sut.doSomething();
		
	}

}
