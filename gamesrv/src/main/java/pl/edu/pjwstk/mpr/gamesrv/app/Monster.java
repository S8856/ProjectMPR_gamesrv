package pl.edu.pjwstk.mpr.gamesrv.app;

public class Monster {
	private int id, hp, max_hp, respawn;
	private float pos_x, pos_y, pos_z;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMax_hp() {
		return max_hp;
	}
	public void setMax_hp(int maxHp) {
		max_hp = maxHp;
	}
	public int getRespawn() {
		return respawn;
	}
	public void setRespawn(int respawn) {
		this.respawn = respawn;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
