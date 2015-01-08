package repo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import Store.User;

public class UserBuilder implements IEntityBuilder<User>{
public User build(ResultSet rs) throws SQLException{
	User result = new User();
	result.setId(rs.getInt("id"));
	result.setLogin(rs.getString("login"));
	result.setPassword(rs.getString("password"));
	return result;
}
}
