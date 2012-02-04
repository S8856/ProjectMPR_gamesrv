package pl.edu.pjwstk.mpr.gamesrv.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;


public class Queries extends Database{
	public Queries(){
		super("localhost", "game_server", "root", "pio123");
		connect();
	}
	
	public ArrayList<Player> getPlayers(){
		PreparedStatement ps;
		ArrayList<Player> pl = new ArrayList<Player>();
		try {
			ps = c.prepareStatement("SELECT * FROM player");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Player p = new Player();
				p.setId(rs.getInt("id"));
				p.setLogin(rs.getString("login"));
				p.setPass(rs.getString("pass"));
				p.setHp(rs.getInt("hp"));
				p.setMax_hp(rs.getInt("max_hp"));
				p.setStrength(rs.getInt("strength"));
				p.setMax_strength(rs.getInt("strength"));
				p.setMana(rs.getInt("mana"));
				p.setMax_mana(rs.getInt("max_mana"));
				p.setCreated_at(rs.getDate("created_at"));
				p.setPos_x(rs.getFloat("pos_x"));
				p.setPos_y(rs.getFloat("pos_y"));
				p.setPos_z(rs.getFloat("pos_z"));
				p.setAngle_x(rs.getFloat("angle_x"));
				p.setAngle_y(rs.getFloat("angle_y"));
				p.setAngle_z(rs.getFloat("angle_z"));
				p.setDexterity(rs.getInt("dexterity"));
				p.setMax_dexterity(rs.getInt("max_dexterity"));
				
				pl.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pl;
	}
	
	public void deletePlayer(Player p){
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("DELETE FROM player WHERE id=?");
			ps.setInt(1, p.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void createPlayer(Player p) throws MySQLIntegrityConstraintViolationException{
		
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("insert into player(login, pass, hp, " +
					"max_hp, strength, max_strength, dexterity, " +
					"max_dexterity, mana, max_mana, pos_x, pos_y, pos_z, " +
					"angle_x, angle_y, angle_z) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getLogin());
			ps.setString(2, p.getPass());
			ps.setInt(3, p.getHp());
			ps.setInt(4, p.getMax_hp());
			ps.setInt(5, p.getStrength());
			ps.setInt(6, p.getMax_strength());
			ps.setInt(7, p.getDexterity());
			ps.setInt(8, p.getMax_dexterity());
			ps.setInt(9, p.getMana());
			ps.setInt(10, p.getMax_mana());
			ps.setFloat(11, p.getPos_x());
			ps.setFloat(12, p.getPos_y());
			ps.setFloat(13, p.getPos_z());
			ps.setFloat(14, p.getAngle_x());
			ps.setFloat(15, p.getAngle_y());
			ps.setFloat(16, p.getAngle_z());
			
			
			ps.executeUpdate();
		} catch (MySQLIntegrityConstraintViolationException e){
			throw e;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void editPlayer(Player p){
		try {
			PreparedStatement ps = c.prepareStatement("UPDATE player SET login = ?, pass = ?, hp = ?," +
					" max_hp = ?, strength = ? , max_strength = ?, dexterity = ?," +
					" max_dexterity =? , mana =? , max_mana = ?, pos_x = ?, pos_y = ?, " +
					"pos_z = ?, angle_x = ?, angle_y =?, angle_z =? where id = ?");
			
			ps.setString(1, p.getLogin());
			ps.setString(2, p.getPass());
			ps.setInt(3, p.getHp());
			ps.setInt(4, p.getMax_hp());
			ps.setInt(5, p.getStrength());
			ps.setInt(6, p.getMax_strength());
			ps.setInt(7, p.getDexterity());
			ps.setInt(8, p.getMax_dexterity());
			ps.setInt(9, p.getMana());
			ps.setInt(10, p.getMax_mana());
			ps.setFloat(11, p.getPos_x());
			ps.setFloat(12, p.getPos_y());
			ps.setFloat(13, p.getPos_z());
			ps.setFloat(14, p.getAngle_x());
			ps.setFloat(15, p.getAngle_y());
			ps.setFloat(16, p.getAngle_z());
			ps.setInt(17, p.getId());
		
			ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
