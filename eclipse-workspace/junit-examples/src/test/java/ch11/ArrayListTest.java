package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	//SUT - テスト対象システム
	private ArrayList<String> sut;
	
	@Before
	public void setUp() {
		
		//SetUp - 事前処理
		this.sut = new ArrayList<String>();
		this.sut.add("A");
		this.sut.add("B");
		this.sut.add("C");
		this.sut.add("D");
		this.sut.add("E");
		
	}
	
	@Test
	public void test() {
		
		//Exercise - テスト実行
		int actual = this.sut.size();
		
		//Verify - 検証
		int expected = 5;
		assertThat(actual, is(expected));
		
	}

}
