package pl.edu.pjwstk.mpr.gamesrv.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class EventHandler extends InterfaceLogic implements ActionListener{
	public EventHandler(){
		super();
		btnRemove.addActionListener(this);
		player_list.addActionListener(this);
		btnEdit.addActionListener(this);
		btnSave.addActionListener(this);
		btnNew.addActionListener(this);
		
	}

	
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source.equals(btnRemove)){
			Player p = (Player)player_list.getSelectedItem();
			q.deletePlayer(p);
			fillPlayersList();
			showSelectedPlayer();
			
		}else if(source.equals(player_list)){
			editMode = false;
			fieldsSetEditable(false);
			showSelectedPlayer();
		}else if(source.equals(btnEdit)){
			editMode = true;
			fieldsSetEditable(true);
			
			
		}else if(source.equals(btnNew)){
			if(editMode){
				try {
					q.createPlayer(getPlayerFromView());
				} catch (MySQLIntegrityConstraintViolationException ex) {
					JOptionPane.showMessageDialog(frame, ex.getMessage());
					return;
				}
				fillPlayersList();
				showSelectedPlayer();
			}else{
				 JOptionPane.showMessageDialog(frame,"You have to click Edit button first");
			}
		}else if(source.equals(btnSave)){
			if(editMode){
				q.editPlayer(getPlayerFromView());
				editMode = false;
				fieldsSetEditable(false);
				fillPlayersList();
				showSelectedPlayer();
			}else{
				JOptionPane.showMessageDialog(frame,"You have to click Edit button first");
			}
		}
		
	}

}
