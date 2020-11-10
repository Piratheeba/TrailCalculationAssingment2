package dao;

import java.sql.ResultSet;
import domain.UserDOM;

public interface UserDAO {
	public boolean insert(UserDOM user);	
	public ResultSet select(UserDOM user);

}
