package ch06;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {

	//商品0の場合
	public static class ItemSize0 {

		ItemStock sut;
		
		@Before
		public void setUp() {
			
			//SetUp - 初期化
			this.sut = new ItemStockImpl();
			
		}
		
		@Test
		public void testSize() throws Exception {
			
			//Exercise - テスト実行
			int actual = this.sut.size("ItemA");
			
			//Verify - 検証
			int expected = 0;
			assertThat(actual, is(expected));
			
		}
		
		@Test
		public void testContains() throws Exception {
			
			//Exercise - テスト実行
			boolean actual = this.sut.contains("ItemA");
			
			//Verify - 検証
			boolean expected = false;
			assertThat(actual, is(expected));
			
		}
		
		@Test
		public void testAdd() throws Exception {
			
			//Exercise - テスト実行
			this.sut.add("ItemA", 1);

			//Verify - 検証
			int actual = this.sut.size("ItemA");
			int expected = 1;
			assertThat(actual, is(expected));

		}
		
	}
	
	//商品2の場合
	public static class ItemSize1 {
		
		ItemStock sut;
		
		@Before
		public void setUp() {
			
			//SetUp - 初期化
			this.sut = new ItemStockImpl();
			this.sut.add("ItemA", 2);
			
		}
		
		@Test
		public void testSize() throws Exception {
			
			//Exercise - テスト実行
			int actual = this.sut.size("ItemA");
			
			//Verify - 検証
			int expected = 2;
			assertThat(actual, is(expected));
			
		}
		
		@Test
		public void testContains() throws Exception {
			
			//Exercise - テスト実行
			boolean actual = this.sut.contains("ItemA");
			
			//Verify - 検証
			boolean expected = true;
			assertThat(actual, is(expected));
			
		}
		
		@Test
		public void testAdd() throws Exception {
			
			//Exercise - テスト実行
			this.sut.add("ItemA", 3);

			//Verify - 検証
			int actual = this.sut.size("ItemA");
			int expected = 5;
			assertThat(actual, is(expected));

		}
		
	}

}
