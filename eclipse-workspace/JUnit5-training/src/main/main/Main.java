package main;

import sub.StringArrayList;

public class Main {
	
	private StringArrayList sub = new StringArrayList();
	
	/**
	 * �T�C�Y�������_����A�`J�̃��X�g���쐬���A�W���o�͂ɕ\������
	 * @return createRandomList()���\�b�h�Ő�������list��size
	 */
	public int getRandomSize() {
		
		this.sub.createRandomList();
		this.sub.log();
		return this.sub.size();
		
	}

	//getter
	public StringArrayList getSub() {
		return sub;
	}
	//setter
	public void setSub(StringArrayList sub) {
		this.sub = sub;
	}
	
}
