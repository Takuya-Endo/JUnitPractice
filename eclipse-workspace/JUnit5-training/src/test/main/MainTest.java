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

		//SUT - �e�X�g�ΏۃV�X�e��
		private Main sut;

		@Test
		void testGetRandomSize() {

			//SetUp - ������
			this.sut = new Main();
			
			//Execute - �e�X�g���s
			int actual = this.sut.getRandomSize();
			
			//Verify - ����
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}
	
	@Nested
	class StubTest {
		
		//SUT - �e�X�g�ΏۃV�X�e��
		private Main sut;
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - ������
			this.sut = new Main();
			
			//Stub - �����_���łȂ��X�^�u���\�b�h�����A�X�^�u�I�u�W�F�N�g�쐬
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
			
			//SetUp - ���O����
			this.sut.setSub(stub);
			
		}

		@Test
		void testGetRandomSize() {
			
			//Execute - �e�X�g���s
			int actual = this.sut.getRandomSize();
			
			//Verify - ����
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}

	@Nested
	class MockTest {
		
		//SUT - �e�X�g�ΏۃV�X�e��
		private Main sut;
		
		//Mock - �����_���łȂ��X�^�u���\�b�h�������A���s�L���Ǝ��s�񐔂��L�^���郂�b�N�I�u�W�F�N�g�쐬
		MockStringArrayList mock = new MockStringArrayList();
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - ������
			this.sut = new Main();
			
			//SetUp - ���O����
			this.sut.setSub(this.mock);
			
		}

		@Test
		void testGetRandomSize() {
			
			//Execute - �e�X�g���s
			this.sut.getRandomSize();
			int actual = this.sut.getRandomSize();
			
			//Verify - ���b�N�L�^����
			this.mock.getFlag(); //or MockStringArrayList mock = (MockStringArrayList) this.sut.getSub(); mock.getFlag();
			assertThat(this.mock.getFlag(), is(true));
			assertThat(this.mock.getConut(), is(2));
			
			//Verify - �e�X�g���ʌ���
			int expected = 10;
			assertThat(actual, is(expected));
			
		}
		
	}

}
