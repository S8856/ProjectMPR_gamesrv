package pl.edu.pjwstk.mpr.gamesrv.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


import javax.swing.JTextField;

public class InterfaceLogic extends UserInterface{
	protected Queries q;
	protected Set<JTextField> fields;
	protected boolean editMode = false;
	
	public InterfaceLogic(){
		super();
		q = new Queries();
		
		fields = new HashSet<JTextField>();
		fields.add(txtLogin);
		fields.add(txtPass);
		fields.add(txtHp);
		fields.add(txtMaxhp);
		fields.add(txtStrength);
		fields.add(txtMaxstrength);
		fields.add(txtDexterity);
		fields.add(txtMaxdexterity);
		fields.add(txtMana);
		fields.add(txtMaxmana);
		fields.add(txtPosx);
		fields.add(txtPosy);
		fields.add(txtPosz);
		fields.add(txtAnglex);
		fields.add(txtAngley);
		fields.add(txtAnglez);
		
		fillPlayersList();
		fieldsSetEditable(false);
		showSelectedPlayer();
	}
	
	public void fillPlayersList(){
		ArrayList<Player> pl = q.getPlayers();
		player_list.removeAllItems();
		for(Player p : pl){
			player_list.addItem(p);
		}
	}
	public void clearPlayerView(){
		for(JTextField t : fields){
			t.setText("");
		}
	}
	public void fieldsSetEditable(boolean i){
		
		for(JTextField t : fields){
			t.setEditable(i);
		}
	}
	
	public void showSelectedPlayer(){
		Player p = (Player)player_list.getSelectedItem();
		if(p == null){
			clearPlayerView();
		}else{
			fillPlayerView(p);
		}
	}
	public Player getPlayerFromView(){
		Player p = new Player();
		p.setLogin(txtLogin.getText());
		p.setPass(txtPass.getText());
		p.setHp(Integer.valueOf(txtHp.getText()));
		p.setMax_hp(Integer.valueOf(txtMaxhp.getText()));
		p.setStrength(Integer.valueOf(txtStrength.getText()));
		p.setMax_strength(Integer.valueOf(txtMaxstrength.getText()));
		p.setDexterity(Integer.valueOf(txtDexterity.getText()));
		p.setMax_dexterity(Integer.valueOf(txtMaxdexterity.getText()));
		p.setMana(Integer.valueOf(txtMana.getText()));
		p.setMax_mana(Integer.valueOf(txtMaxmana.getText()));
		p.setPos_x(Float.valueOf(txtPosx.getText()));
		p.setPos_y(Float.valueOf(txtPosy.getText()));
		p.setPos_z(Float.valueOf(txtPosz.getText()));
		p.setAngle_x(Float.valueOf(txtAnglex.getText()));
		p.setAngle_y(Float.valueOf(txtAngley.getText()));
		p.setAngle_z(Float.valueOf(txtAnglez.getText()));
		p.setId(((Player)player_list.getSelectedItem()).getId());
		return p;
	}
	
	public void fillPlayerView(Player p){
		txtLogin.setText(p.getLogin());
		txtPass.setText(p.getPass());
		txtHp.setText(Integer.toString(p.getHp()));
		txtMaxhp.setText(Integer.toString(p.getMax_hp()));
		txtStrength.setText(Integer.toString(p.getStrength()));
		txtMaxstrength.setText(Integer.toString(p.getMax_strength()));
		txtDexterity.setText(Integer.toString(p.getDexterity()));
		txtMaxdexterity.setText(Integer.toString(p.getMax_dexterity()));
		txtMana.setText(Integer.toString(p.getMana()));
		txtMaxmana.setText(Integer.toString(p.getMax_mana()));
		txtPosx.setText(Float.toString(p.getPos_x()));
		txtPosy.setText(Float.toString(p.getPos_y()));
		txtPosz.setText(Float.toString(p.getPos_z()));
		txtAnglex.setText(Float.toString(p.getAngle_x()));
		txtAngley.setText(Float.toString(p.getAngle_y()));
		txtAnglez.setText(Float.toString(p.getAngle_z()));
		
	}
}
