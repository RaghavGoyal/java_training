package ExceptionExample;

import java.io.FileNotFoundException;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User("","");
		UserApi api=new UserApiImpl();
		try {
			
			api.addUser(user);
		}
		catch(AppException ae) {
//			System.out.println("check");
			System.out.println(ae.getMessage());
		}
		System.out.println("User added !");

	}

}
