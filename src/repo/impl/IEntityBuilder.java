package repo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import Store.Entity;

public interface IEntityBuilder<TEntity extends Entity> {
public TEntity build(ResultSet rs) throws SQLException;
}
