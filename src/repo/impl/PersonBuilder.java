package repo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import Store.Person;

public class PersonBuilder implements IEntityBuilder<Person>{
	
public Person build (ResultSet rs) throws SQLException{
Person person = new Person();
person.setFirstName(rs.getString("name"));
person.setSurname(rs.getString("surname"));
person.setPesel(rs.getString("pesel"));
person.setId(rs.getInt("id"));
return person;
}
}
