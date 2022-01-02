package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

public class DateDependencyExampleTest {

	@Test
	public void testDoSomething() {
		
		//SetUp - 初期化
		DateDependencyExample sut = new DateDependencyExample();
		
		//Exercise - テスト実行
		sut.doSomething();
		Date actual = sut.date;
		
		//Verify - 検証
		Date expected = new Date();
		assertThat(actual, is(expected));
		
	}


}
