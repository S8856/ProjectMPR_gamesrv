package pl.edu.pjwstk.mpr.gamesrv.app;

public class Item {
	private int id, owner_id, value;
	private String name, description;
	private float pos_x, pos_y, pos_z;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int ownerId) {
		owner_id = ownerId;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPos_x() {
		return pos_x;
	}
	public void setPos_x(float posX) {
		pos_x = posX;
	}
	public float getPos_y() {
		return pos_y;
	}
	public void setPos_y(float posY) {
		pos_y = posY;
	}
	public float getPos_z() {
		return pos_z;
	}
	public void setPos_z(float posZ) {
		pos_z = posZ;
	}
}
