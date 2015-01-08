package repo.impl;

import java.sql.Connection;
import java.sql.SQLException;

import unitowork.IUnitOfWork;
import Store.Person;

public abstract class PersonRepository extends Repository<Person>{
	protected PersonRepository(Connection connection, IEntityBuilder<Person> builder, IUnitOfWork uow){
	super(connection, builder, null);

}
protected void setUpUpdateQuery(Person entity) throws SQLException {
	update.setString(1, entity.getFirstName());
	update.setString(2, entity.getSurname());
	update.setString(3, entity.getPesel());
	update.setInt(4, entity.getId());
	
}
protected void SsetUpInsertQuery(Person entity) throws SQLException {
	insert.setString(1, entity.getFirstName());
	insert.setString(2, entity.getSurname());
	insert.setString(3, entity.getPesel());
}
protected String getTabelName(){
	return "person";
}
protected String getUpdateQuery(){
	return "update person set (name,surname,pesel)=(?,?,?)"+ "where ID man??";
}
protected String getInsertQuery(){
	return "insert into person(name,surname,pesel) values(O.o?,-.-?,T.T?";
	
}}