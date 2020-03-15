package ExceptionExample;

import java.io.FileNotFoundException;

public interface UserApi {
	void addUser(User user)throws AppException;

}
