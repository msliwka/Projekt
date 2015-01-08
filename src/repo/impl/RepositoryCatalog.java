package repo.impl;

import java.sql.Connection;
import Store.*;
import repos.IRepository;
import repos.IRepositoryCatalog;
import repos.IUserRepository;
import unitowork.IUnitOfWork;



public class RepositoryCatalog implements IRepositoryCatalog{

	private Connection connection;
	private IUnitOfWork uow;
	
	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	@Override
	public IUserRepository getUsers() {
		return new UserRepository(connection, new UserBuilder(), uow);
	}

	@Override
	public IRepository<Person> getPersons() {
		return new PersonRepository(connection, new PersonBuilder(), uow);
	}

	@Override
	public IRepository<Role> getRoles() {
		return null;
	}

}

