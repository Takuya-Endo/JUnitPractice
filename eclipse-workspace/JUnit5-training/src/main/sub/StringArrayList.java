package sub;

import java.util.ArrayList;
import java.util.Random;

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
	
	/**
	 * A�`J�̃��X�g���쐬�A�T�C�Y�̓����_��
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
