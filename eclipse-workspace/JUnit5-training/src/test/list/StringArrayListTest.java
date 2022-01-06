package list;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import mock.MockStringArrayList;

class StringArrayListTest {
	
	@Nested
	class NomalTest {

		//SUT - テスト対象システム
		private StringArrayList sut;

		@Test
		void testSize() {

			//SetUp - 初期化
			this.sut = new StringArrayList();
			
			//SetUp - 事前処理
			this.sut.createRandomList();
			
			//Execute - テスト実行
			int actual = this.sut.size();
			
			//Verify - 検証
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}
	
	@Nested
	class StubTest {
		
		//SUT - テスト対象システム
		private StringArrayList sut;
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - 初期化
			this.sut = new StringArrayList();
			
			//Stub - ランダムでないスタブメソッドを持つ、スタブオブジェクト作成
			StringArrayList stub = new StringArrayList() {
				
				@Override
				public void createRandomList() {
					this.add("A");
					this.add("B");
					this.add("C");
					this.add("D");
					this.add("E");
				}
				
			};
			
			//SetUp - 事前処理
			this.sut = stub;
			this.sut.createRandomList();
			
		}

		@Test
		void testSize() {
			
			//Execute - テスト実行
			int actual = this.sut.size();
			
			//Verify - 検証
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}
	
	@Nested
	class MockTest {
		
		//SUT - テスト対象システム
		private StringArrayList sut;
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - 初期化
			this.sut = new StringArrayList();
			
			//Stub - ランダムでないスタブメソッドを持ち、実行有無と実行回数を記録するモックオブジェクト作成
			MockStringArrayList mock = new MockStringArrayList();
			
			//SetUp - 事前処理
			this.sut = mock;
			this.sut.createRandomList();
			this.sut.createRandomList();
			
		}

		@Test
		void testSize() {
			
			//Execute - テスト実行
			int actual = this.sut.size();
			
			//Verify - 検証
			
			int expected = 10;
			assertThat(actual, is(expected));
			
		}
		
	}

}
