package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoSample {
	
	@Test
	public void testMockitoSample() {
	
		//初め動かなくて、VM引数試して、動かなくて、消して再度試したら成功した。。
		List<String> mock = Mockito.mock(List.class);
		assertThat(mock.get(0), is(nullValue()));
		assertThat(mock.contains("Hello"), is(false));
		
		//Arrange - スタブオブジェクト初期化
		List<String> stub = Mockito.mock(List.class);
		//Arrange - スタブメソッド定義
		when(stub.get(0)).thenReturn("Hello");
		//Assert - スタブメソッドの戻り値を検証
		assertThat(stub.get(0), is("Hello"));
		
		//Arrange - 例外送出
		when(stub.get(2)).thenThrow(new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException"));
		try {
			//Act - テスト実行
			stub.get(2);
			//Assert - 例外が送出されず、ここに到達したらテスト失敗
			fail("No ArrayIndexOutOfBoundsException");
		} catch (ArrayIndexOutOfBoundsException e) {
			//Assert - catchした例外をテスト
			assertThat(e.getMessage(), is("ArrayIndexOutOfBoundsException"));
		}
		
		//voidメソッドのスタブ化
		Mockito.doThrow(new Exception("ExsampleException")).when(stub).clear();
		try {
			stub.clear();
			fail("No ArrayIndexOutOfBoundsException");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("ExsampleException"));
		}
		
	}
	
	
	
}
