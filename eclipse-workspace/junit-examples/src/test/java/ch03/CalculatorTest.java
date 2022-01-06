package ch03;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	@Ignore
	@Test
	public void testDivide() throws Exception {
		
		//SetUp - 初期化
		Calculator sut = new Calculator();
		
		//Execute - テスト実行
		int actual = sut.divide(2, 3);
		
		//Verify - 検証
		int expected = 0;
		assertThat(actual, is(expected));
		
	}

}
