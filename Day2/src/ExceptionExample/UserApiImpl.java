package ExceptionExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserApiImpl implements UserApi {

	@Override
	public void addUser(User user) throws AppException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("");
		}
		catch(FileNotFoundException fe) {
			throw new AppException("Something went Wrong...Try again later.", fe);
		}
		
		
	}
	

}
