package ch11;

import static ch11.RandomsTestFixtures.list;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RandomsStubTest {

	public static class StubTest {

		//SUT - テスト対象システム
		private Randoms sut;
		
		@Before
		public void setUp() {

			//SetUp - 初期化
			this.sut = new Randoms();
			
			RandomNumberGeneratorImpl stub = new RandomNumberGeneratorImpl() {
				
				@Override
			    public int nextInt() {
			        return 0;
			    }
				
			};
			this.sut.generator = stub;
			
			RandomsTestFixtures.createList();
		
		}
		
		@Test
		public void testChoice() {
			
			//Exercise - テスト実行
			String actual = this.sut.choice(list);
			
			//Verify - 検証
			String expected = "A";
			assertThat(actual, is(expected));
			
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
			
			//Exercise - テスト実行
			String actual = this.sut.choice(list);
			
			//Verify - 検証
			System.out.println(actual);
			
		}
		
	}

}
