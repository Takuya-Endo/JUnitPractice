package main;

import sub.StringArrayList;

public class Main {
	
	private StringArrayList sub = new StringArrayList();
	
	/**
	 * サイズがランダムなA～Jのリストを作成し、標準出力に表示する
	 * @return createRandomList()メソッドで生成したlistのsize
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
