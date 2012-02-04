package pl.edu.pjwstk.mpr.gamesrv.app;

import java.sql.Date;

public class Player {
	private int id, hp, max_hp, strength, max_strength, dexterity, max_dexterity, mana, max_mana;
	private float pos_x, pos_y, pos_z, angle_x, angle_y, angle_z;
	private Date created_at;
	private String login, pass;
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
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getMax_strength() {
		return max_strength;
	}
	public void setMax_strength(int maxStrength) {
		max_strength = maxStrength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getMax_dexterity() {
		return max_dexterity;
	}
	public void setMax_dexterity(int maxDexterity) {
		max_dexterity = maxDexterity;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getMax_mana() {
		return max_mana;
	}
	public void setMax_mana(int maxMana) {
		max_mana = maxMana;
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
	public float getAngle_x() {
		return angle_x;
	}
	public void setAngle_x(float angleX) {
		angle_x = angleX;
	}
	public float getAngle_y() {
		return angle_y;
	}
	public void setAngle_y(float angleY) {
		angle_y = angleY;
	}
	public float getAngle_z() {
		return angle_z;
	}
	public void setAngle_z(float angleZ) {
		angle_z = angleZ;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date createdAt) {
		created_at = createdAt;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String toString() {
		return login + "    [hp=" + hp + ", id=" + id + ", pos_x=" + pos_x + ", pos_y=" + pos_y + ", pos_z=" + pos_z
				+ "]";
	}
}
