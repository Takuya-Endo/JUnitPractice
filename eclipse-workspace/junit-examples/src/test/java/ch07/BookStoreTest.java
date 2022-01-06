package ch07;

import static ch07.BookStoreTestFixtures.bookA;
import static ch07.BookStoreTestFixtures.bookB;
import static ch07.BookStoreTestFixtures.createBookA;
import static ch07.BookStoreTestFixtures.createBookB;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class BookStoreTest {

	public static class BookStoreCart0 {
	
		//SUT - テスト対象システム
		private BookStore sut;
		
		@Before
		public void setUp() {
			
			//SetUp - 初期化
			this.sut = new BookStore();
			
		}
		
		@Test
		public void testGetTotalPrice() throws Exception {
			
			//Execute - テスト実行
			int actual = this.sut.getTotalPrice();
			
			//Verify - 検証
			int expected = 0;
			assertThat(actual, is(expected));
			
		}
		
		//Verify - 検証
		@Test(expected = IndexOutOfBoundsException.class)
		public void testGet() throws Exception {
			
			//Execute - テスト実行
			this.sut.get(0);
			
			//Verify - 検証
			fail("No IndexOutOfBoundsException");
			
		}

		@Test
		public void testAddToCart() throws Exception {
			
			//SetUp - 初期化
			createBookB();
			
			//Execute - テスト実行
			this.sut.addToCart(bookB, 1);
			
			//Verify - 検証
			List<Book> actual = this.sut.cart;
			assertThat(actual.size(), is(1));
			assertThat(actual.get(0).title, is("BookTitleB"));
			assertThat(actual.get(0).price, is(2000));
			
		}
		
	}
	
	public static class BookStoreCart2 {

		//SUT - テスト対象システム
		private BookStore sut;
		
		@Before
		public void setUp() {
			
			//SetUp - 初期化
			this.sut = new BookStore();

			createBookA();
			createBookB();
			
			this.sut.cart.add(bookA);
			this.sut.cart.add(bookA);
			
		}
		
		@Test
		public void testGetTotalPrice() throws Exception {
			
			//Execute - テスト実行
			int actual = this.sut.getTotalPrice();
			
			//Verify - 検証
			int expected = 2000;
			assertThat(actual, is(expected));
			
		}
		
		@Test
		public void testGet() throws Exception {
			
			//Execute - テスト実行
			Book actual = this.sut.get(0);
			
			//Verify - 検証
			assertThat(actual.getTitle(), is("BookTitleA"));
			assertThat(actual.getPrice(), is(1000));
			
		}

		@Test
		public void testAddToCart() throws Exception {
			
			//Execute - テスト実行
			this.sut.addToCart(bookB, 3);
			
			//Verify - 検証
			List<Book> actual = this.sut.cart;
			assertThat(actual.size(), is(5));
			assertThat(actual.get(4).title, is("BookTitleB"));
			assertThat(actual.get(4).price, is(2000));
			
		}
		
	}
		
}
