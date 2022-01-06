package ch11;

import static ch11.RandomsTestFixtures.list;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class RandomsMockTest {

	public static class MockTest {

		//SUT - テスト対象システム
		private Randoms sut;
		
		//呼出し検証
		private boolean flgMock = false;
		
		@Before
		public void setUp() {

			//SetUp - 初期化
			this.sut = new Randoms();
			
			RandomNumberGeneratorImpl mock = new RandomNumberGeneratorImpl() {
				
				@Override
			    public int nextInt() {
					flgMock = true; //Mock
			        return 0;
			    }
				
			};
			this.sut.generator = mock;
			
			RandomsTestFixtures.createList();
		
		}
		
		@Test
		public void testChoice() {
			
			//Execute - テスト実行
			String actual = this.sut.choice(list);
			
			//Verify - 検証
			String expected = "A";
			assertThat(actual, is(expected));   //SUT
			assertThat(this.flgMock, is(true)); //Mock
			
		}
		
	}
	
	public static class RandomTest {

		//SUT - テスト対象システム
		private Randoms sut;
		
		@Before
		public void setUp() {

			//SetUp - 初期化
			this.sut = new Randoms();
			RandomsTestFixtures.createList();
		
		}
		
		@Test
		public void testChoice() {
			
			//Execute - テスト実行
			String actual = this.sut.choice(list);
			
			//Verify - 検証
			System.out.println(actual);
			
		}
		
	}

}
