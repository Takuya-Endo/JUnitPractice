package sut;

import java.util.ArrayList;

@SuppressWarnings("serial") //�p���ɂ������Ă̌x�����b�Z�[�W����
public class StringArrayList extends ArrayList<String> {
	
	/**
	 * ���X�g�̒��g���u,�v��؂�ŕW���o�͂֕\��
	 */
	public void log() {
		
		String log = "";
		for (String str : this) {
			log += str + ",";
		}
		System.out.println(log);
	
	}
	
}
