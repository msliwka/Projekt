package repo.impl;

import java.util.*;
import Store.Person;
import repos.IRepository;

public class DummyPersonRepository implements IRepository<Person>{
	
	private DummyDb db;
	
	public DummyPersonRepository(DummyDb db){
		super();
		this.db = db;
	}

	public void save(Person entity) {
		db.persons.add(entity);
	}
	public void updata(Person entity){
		
	}
	public void delete(Person entity){
		db.persons.remove(entity);
		
	}

 public Person get(int id) {
	 for(Person p: db.persons)
		 if(p.getId()==id)
			 return p;
	 return null;
 }
 public List<Person> getAll()
 {
	 return db.persons;
 }}