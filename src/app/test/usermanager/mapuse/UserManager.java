package app.test.usermanager.mapuse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
	private List<String> forbitUsers = Arrays.asList();
	//Key存储username,value存储username的用户对象
	Map<String,User> users;

	public UserManager(int size){
		users = new HashMap<String,User>();
	}

	public void add(User user){
		if (user.getPassword().length()<=6){
			throw new UserException();
		}
		if (forbitUsers.contains(user.getUsername())){
			throw new UserException(user.getUsername()+"不能使用");
		}
		if (users.containsKey(user.getUsername())) {
			throw new UserException("用户："+user.getUsername()+"已存在!不能添加");
		}
		users.put(user.getUsername(),user);
		System.out.println("添加成功");
	}


	public void update(User user){
		if (!users.containsKey(user.getUsername())){
			throw new UserException("用户不存在，无法更新！");
		}
		users.put(user.getUsername(),user);
		System.out.println("更新成功");
	}

	public void delete(String username){
 		users.remove(username);
	}

	public User load(String username){
 		return users.get(username);
	}
	
	public User login(String username,String password){
		User u = load(username);
		if (u==null){
			throw new UserException("用户名不正确");
		}
		if (users.get(username).getPassword().equals(password)){
 			throw new UserException("密码错误");
		}
		System.out.println("登陆成功");
		return u;
	}
	
	public void list(){
 		for (String str:users.keySet()){
			System.out.println(users.get(str));
		}
	}
}
