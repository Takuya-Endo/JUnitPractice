package ch04;

import static ch04.IsDate.dateOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

public class SystemOutNowDateTest {

	@Ignore
	@Test
	public void testSystemOutNowDateString() throws Exception {
		
		//SetUp - 初期化
		SystemOutNowDate sut = new SystemOutNowDate();
		
		//Execute - テスト実行
		String actual = sut.systemOutNowDate();
		
		//Verify - 検証
		String exoected = "Sun Jan 02 10:40:00 JST 2022";
		assertThat(actual, is(exoected));
		
	}
	
	@Test
	public void testNowDate() throws Exception {
		
		//SetUp - 初期化
		SystemOutNowDate sut = new SystemOutNowDate();
		
		//Execute - テスト実行
		Date actual = sut.nowDate();
		
		//Verify - 検証
		assertThat(actual, dateOf(2022, 01, 02));
		
	}

}
