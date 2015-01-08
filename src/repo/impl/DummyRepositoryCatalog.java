package repo.impl;

import repos.IRepository;
import repos.IRepositoryCatalog;
import repos.IUserRepository;
import Store.Person;
import Store.Role;


public class DummyRepositoryCatalog  implements IRepositoryCatalog{
	
	private DummyDb db = new DummyDb();
	
	public IUserRepository getUsers() {
		return new DummyUserRepository(db);
	}

	public IRepository<Person> getPersons(){
	
		return new DummyPersonRepository(db);
	}
		public IRepository<Role> getRoles()	{
		
			return new DummyRoleRepository(db);
	}
}

