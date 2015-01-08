package Store;

import java.util.ArrayList;
import java.util.List;

public class Role extends Entity {
	
	private String name;
	private List<Privilege> privileges;
	private List<User> users;
public Role()
{
	privileges = new ArrayList<Privilege>();
	users = new ArrayList<User>();
}
public String getName() {
	return name;
}
public List<User> getUsers() {
	return users;
}
public void setName(String name) {
	this.name = name;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public List<Privilege> getPrivilage() {
	return privileges;
}
public void setRoles(List<Privilege> privilages) {
	this.privileges = privilages;
	}
}
