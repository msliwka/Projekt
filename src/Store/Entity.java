package Store;

import Store.EntityUse;

public abstract class Entity {
private int id;
EntityUse State;

	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public EntityUse getState() {
		return State;
	}
public void setState(EntityUse state){
	this.State = state;
}
}
