package ch06;

import java.util.ArrayList;
import java.util.List;

/**
 * リスト6.3 UserDaoクラス
 * @author shuji.w6e
 */
public class UserDao {

	private List<User> userList = new ArrayList<User>();
	
	public void setList(String name) {
		
    	User user = new User();
    	user.setName(name);
		this.userList.add(user);
    	
	}
	
    public List<User> getList() {
    	
    	if (this.userList.size() >= 1) {
    		return this.userList;
    	}
    	
        throw new UnsupportedOperationException("未実装");
    }
}
