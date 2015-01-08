package repos;

import java.util.List;

import Store.*;

public interface IUserRepository extends IRepository<User> {

	public List<User> withRole(Role role);
	public List<User> withRole (String roleName);
	public List<User> withRole(int roleId);
	
 }
