package ch11;

import java.util.ArrayList;

public class ArrayListTestFixtures {

	//SUT - テスト対象システム
	public static ArrayList<String> sut;
	
	public static void initializeList() {
		
		//SetUp - 初期化
		ArrayListTestFixtures.sut = new ArrayList<String>();
		ArrayListTestFixtures.sut.add("A");
		ArrayListTestFixtures.sut.add("B");
		ArrayListTestFixtures.sut.add("C");
		ArrayListTestFixtures.sut.add("D");
		ArrayListTestFixtures.sut.add("E");
		
	}
	
}
