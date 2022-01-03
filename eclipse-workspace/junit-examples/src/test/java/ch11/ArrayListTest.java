package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	
	
	@Test
	public void test() {
		
		//SetUp - 事前処理
		ArrayList<String> sut = new ArrayList<String>();
		sut.add("A");
		sut.add("B");
		sut.add("C");
		sut.add("D");
		sut.add("E");
		
		//Exercise - テスト実行
		int actual = sut.size();
		
		//Verify - 検証
		int expected = 5;
		assertThat(actual, is(expected));
		
	}

}
