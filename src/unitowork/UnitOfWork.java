package unitowork;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import Store.Entity;
import Store.EntityUse;



public class UnitOfWork implements IUnitOfWork {

	private Connection connection;
	
	private Map<Entity, IUnitOfWorkRepository> entities = 
			new LinkedHashMap<Entity, IUnitOfWorkRepository>();
	
	public UnitOfWork(Connection connection) {
		super();
		this.connection = connection;
		
		try {
			connection.setAutoCommit(false);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void commit() {

		for(Entity entity: entities.keySet())
		{
			switch(entity.getState())
			{
			case Changed:
				entities.get(entity).persistUpdate(entity);
				break;
			case Deleted:
				entities.get(entity).persistDelete(entity);
				break;
			case New:
				entities.get(entity).persistAdd(entity);
				break;
			case Unchanged:
				break;
			default:
				break;}
		}
		
		try {
			connection.commit();
			entities.clear();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void rollback() {

		entities.clear();
		
	}



	@Override
	public void markAsNew(Entity entity, IUnitOfWorkRepository repository) {
		entity.setState(EntityUse.New);
		entities.put(entity, repository);
		
	}

	@Override
	public void markAsDirty(Entity entity, IUnitOfWorkRepository repository) {
		entity.setState(EntityUse.Changed);
		entities.put(entity, repository);
		
	}

	@Override
	public void markAsDeleted(Entity entity, IUnitOfWorkRepository repository) {
		entity.setState(EntityUse.Deleted);
		entities.put(entity, repository);
		
	}

}
