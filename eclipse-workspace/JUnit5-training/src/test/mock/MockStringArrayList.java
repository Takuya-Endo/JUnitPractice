package mock;

import list.StringArrayList;

@SuppressWarnings("serial") //継承にあたっての警告メッセージ無視
public class MockStringArrayList extends StringArrayList {

	private boolean flag = false;
	private int count = 0;
	
	@Override
	public void createRandomList() {
		
		this.add("A");
		this.add("B");
		this.add("C");
		this.add("D");
		this.add("E");
		
		this.flag = true;
		this.count++;
	
	}
	
	public boolean getFlag() {
		return this.flag;
	}
	
	public int getConut() {
		return this.count;
	}
	
}
