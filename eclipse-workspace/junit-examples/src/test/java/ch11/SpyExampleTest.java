package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SpyExampleTest {

	@Test
	public void testDoSomething() {
		
		//SetUp - 初期化
			SpyExample sut = new SpyExample();
			//フィールドに記録できるようにしたSpy生成
			SpyLogger spy = new SpyLogger();
			//Spy注入
			sut.logger = spy;
		
		//Exercise - テスト実行
			sut.doSomething();
			//Spyを使ってログ出力をactualに格納
			String actual = spy.getLog();
		
		//Verify - 検証
			String expected = "doSomething";
			assertThat(actual, is(expected));
			
	}

}
