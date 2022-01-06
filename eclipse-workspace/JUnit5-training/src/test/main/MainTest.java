package main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import mock.MockStringArrayList;
import sub.StringArrayList;

class MainTest {
	
	@Nested
	class NomalTest {

		//SUT - テスト対象システム
		private Main sut;

		@Test
		void testGetRandomSize() {

			//SetUp - 初期化
			this.sut = new Main();
			
			//Execute - テスト実行
			int actual = this.sut.getRandomSize();
			
			//Verify - 検証
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}
	
	@Nested
	class StubTest {
		
		//SUT - テスト対象システム
		private Main sut;
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - 初期化
			this.sut = new Main();
			
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
			this.sut.setSub(stub);
			
		}

		@Test
		void testGetRandomSize() {
			
			//Execute - テスト実行
			int actual = this.sut.getRandomSize();
			
			//Verify - 検証
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}

	@Nested
	class MockTest {
		
		//SUT - テスト対象システム
		private Main sut;
		
		//Mock - ランダムでないスタブメソッドを持ち、実行有無と実行回数を記録するモックオブジェクト作成
		MockStringArrayList mock = new MockStringArrayList();
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - 初期化
			this.sut = new Main();
			
			//SetUp - 事前処理
			this.sut.setSub(this.mock);
			
		}

		@Test
		void testGetRandomSize() {
			
			//Execute - テスト実行
			this.sut.getRandomSize();
			int actual = this.sut.getRandomSize();
			
			//Verify - モック記録検証
			this.mock.getFlag(); //or MockStringArrayList mock = (MockStringArrayList) this.sut.getSub(); mock.getFlag();
			assertThat(this.mock.getFlag(), is(true));
			assertThat(this.mock.getConut(), is(2));
			
			//Verify - テスト結果検証
			int expected = 10;
			assertThat(actual, is(expected));
			
		}
		
	}

}
