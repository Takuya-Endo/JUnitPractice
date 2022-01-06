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

		//SUT - �e�X�g�ΏۃV�X�e��
		private StringArrayList sut;

		@Test
		void testSize() {

			//SetUp - ������
			this.sut = new StringArrayList();
			
			//SetUp - ���O����
			this.sut.createRandomList();
			
			//Execute - �e�X�g���s
			int actual = this.sut.size();
			
			//Verify - ����
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}
	
	@Nested
	class StubTest {
		
		//SUT - �e�X�g�ΏۃV�X�e��
		private StringArrayList sut;
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - ������
			this.sut = new StringArrayList();
			
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
			this.sut = stub;
			this.sut.createRandomList();
			
		}

		@Test
		void testSize() {
			
			//Execute - �e�X�g���s
			int actual = this.sut.size();
			
			//Verify - ����
			int expected = 5;
			assertThat(actual, is(expected));
			
		}
		
	}
	
	@Nested
	class MockTest {
		
		//SUT - �e�X�g�ΏۃV�X�e��
		private StringArrayList sut;
		
		@BeforeEach
		void setUp() throws Exception {
			
			//SetUp - ������
			this.sut = new StringArrayList();
			
			//Stub - �����_���łȂ��X�^�u���\�b�h�������A���s�L���Ǝ��s�񐔂��L�^���郂�b�N�I�u�W�F�N�g�쐬
			MockStringArrayList mock = new MockStringArrayList();
			
			//SetUp - ���O����
			this.sut = mock;
			this.sut.createRandomList();
			this.sut.createRandomList();
			
		}

		@Test
		void testSize() {
			
			//Execute - �e�X�g���s
			int actual = this.sut.size();
			
			//Verify - ����
			
			int expected = 10;
			assertThat(actual, is(expected));
			
		}
		
	}

}
