package sub;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("serial") //継承にあたっての警告メッセージ無視
public class StringArrayList extends ArrayList<String> {
	
	/**
	 * リストの中身を「,」区切りで標準出力へ表示
	 */
	public void log() {
		
		String log = "";
		for (String str : this) {
			log += str + ",";
		}
		System.out.println(log);
	
	}
	
	/**
	 * A～Jのリストを作成、サイズはランダム
	 */
	public void createRandomList() {
		
		Random random = new Random();
		int size = random.nextInt(10);
		for (int i = 1; i <= size; i++) {	
			char c = (char) (i + 64);
			this.add(String.valueOf(c));
		}
		
	}
	
}
