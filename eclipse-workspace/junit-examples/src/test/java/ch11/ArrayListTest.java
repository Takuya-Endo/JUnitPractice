package ch11;

import static ch11.ArrayListTestFixtures.sut;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {
	
	@Test
	public void testOriginStub() {
		
		//SetUp - 事前処理
		ArrayListTestFixtures.initializeList();
		
		//Stub - get()メソッドとsize()メソッドをオーバーライド
		ArrayList<String> stub = new ArrayList<String>() {
			
			//この下の「sut.get(0);」を選択してF2
			//String java.util.ArrayList.get(int index)
			//そのままメソッドをコピペして不要な完全限定クラスを削除
			@Override
			public String get(int index) {
				return "FirstElement";
			}
			
			//同様にsut.size();からコピー
			public int size() {
				return 5;
			}
			
		};
		sut = stub;
		
		//Execute - テスト実行
		int actualSize = sut.size();
		sut.add("FirstElement");
		String actualElement = sut.get(0);
		
		//Verify - 検証
		int expectedSize = 5;
		String expectedElement = "FirstElement";
		assertThat(actualSize, is(expectedSize));
		assertThat(actualElement, is(expectedElement));
		
	}
	
	@Test
	public void testOriginMock() {
	}
	
	@Test
	public void testUseMockito() {
	}

}
