package ch11;

import static ch11.ArrayListTestFixtures.sut;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArrayListTest {
	
	@Test
	public void testOriginStub() {
		
		//SetUp - 事前処理
		ArrayListTestFixtures.initializeList();
		
		//Exercise - テスト実行
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
