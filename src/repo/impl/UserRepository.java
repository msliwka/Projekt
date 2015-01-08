package repo.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import repos.IUserRepository;
import unitowork.IUnitOfWork;
import Store.Role;
import Store.User;




public class UserRepository extends Repository<User> implements IUserRepository{
	
public UserRepository(Connection connection, IEntityBuilder<User> builder, IUnitOfWork uow) {
	super(connection,builder, uow);
}

@Override
protected String getTableName() {
	return "users";
}

@Override
protected String getUpdateQuery() {
	return 
			"UPDATE users SET (login,password)=(?,?) WHERE id=?";
}

@Override
protected String getInsertQuery() {
	return "INSERT INTO users(login,password)"
			+ "VALUES(?,?)";
}


@Override
protected void setUpInsertQuery(User entity) throws SQLException {
	
	insert.setString(1, entity.getLogin());
	insert.setString(2, entity.getPassword());
	
}

@Override
protected void setUpUpdateQuery(User entity) throws SQLException {
	update.setString(1, entity.getLogin());
	update.setString(2, entity.getPassword());
	update.setInt(3, entity.getId());
	
	
}

@Override
public List<User> withRole(Role role) {
		return null;
}

@Override
public List<User> withRole(String roleName) {
	return null;
}

@Override
public List<User> withRole(int roleId) {
	return null;
}

@Override
public void updata(User entity) {
	
}

@Override
public List<User> getAll() {
	return null;
}

@Override
public List<User> withRole(Role role) {
	return null;
}

@Override
public List<User> withRole(String roleName) {
	return null;
}

@Override
public List<User> withRole(int roleId) {
	return null;
	}
}