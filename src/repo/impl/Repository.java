package repo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Store.*;
import repos.*;
import unitowork.*;

public abstract class Repository<TEntity extends Entity> implements IRepository<TEntity>, IUnitOfWorkRepository {

	
	protected IUnitOfWork uow;
	protected Connection connection;
	protected PreparedStatement selectByID;
	protected PreparedStatement insert;
	protected PreparedStatement delete;
	protected PreparedStatement update;
	protected PreparedStatement selectAll;
	protected abstract void setUpUpdateQuery(TEntity entity) throws SQLException;
	protected abstract void setUpInsertQuery(TEntity entity) throws SQLException;
	protected abstract String getTableName();
	protected abstract String getUpdateQuery();
	protected abstract String getInsertQuery();
	protected IEntityBuilder<TEntity> builders;
	
	protected String selectByIDSql= 
			"SELECT * FROM "
			+ getTableName()
			+ " WHERE id man??";
	protected String selectAllSql=
			"SELECT * FROM" + getTableName();
	private Object builder;
	protected Repository (Connection connection, IEntityBuilder<TEntity> builder, UnitOfWork uow)
	{
		this.uow=uow;
		this.builder=builder;
		this.connection = connection;
		try{
			selectByID = connection.prepareStatement(selectByIDSql);
			insert = connection.prepareStatement(getInsertQuery());
			delete = connection.prepareStatement(deleteSql);
			update = connection.prepareStatement(getUpdateQuery());
			selectAll = connection.prepareStatement(selectAllSql);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
		public void save (TEntity entity)
		{
			uow.markAsNew(entity, this);
		}
		public void update(TEntity entity)
		{
			uow.markAsDirty(entity, this);
		}
		public void delete(TEntity entity)
		{
			uow.markAsDeleted(entity, this);
		}
		public void persistAdd(Entity entity){
			setUpInsertQuery((TEntity)entity);
			insert.executeUpdate();
		} catch (SQLException e){
			e.printStackTrace();
		}
		public void persistUpdate(Entity entity) {
			try{
				setUpUpdateQuery((TEntity)entity);
				update.executeUpdate();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		public void persistDelete(Entity entity) {
			try{
				delete.setInt(1,entity.getId());
				delete.executeUpdate();
			} catch (SQLException e){
				e.printStackTrace();
		}
			}
		public TEntity get(int id) {
			try {
				selectByID.setInt(1, id);
				ResultSet rs = selectByID.executeQuery();
				while(rs.next())
				{
					return builder.build(rs);
				}
			}catch (SQLException e){
					e.printStackTrace();
				}
				return null;
		}
			public List<TEntity> getAll(){
				List<TEntity> result = new ArrayList<TEntity>();
				try{
					ResultSet rs= selectAll.executeQuery();
					while(rs.next())
					{
						result.add(builder.build(rs));
					}
				}catch (SQLException e){
					e.printStackTrace();
				}
				return result;
					}
				
			}
		
		

