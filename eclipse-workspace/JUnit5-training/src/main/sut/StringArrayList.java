package sut;

import java.util.ArrayList;

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
	
}
