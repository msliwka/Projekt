package repo.impl;

import java.util.List;
import repos.IRepository;
import Store.Role;

public abstract class DummyRoleRepository implements IRepository<Role>{
DummyDb db;
public DummyRoleRepository(DummyDb db){
	
}
public void save(Role entity) {
	db.roles.add(entity);
}
public void update(Role entity){
	
}
public void delete(Role entity){
	db.roles.remove(entity);
}
public Role get(int id) {
	for (Role r : db.roles)
		if (r.getId()==id)
			return r;
	return null;
}
public List<Role> getAll(){
	return db.roles;
}
}
