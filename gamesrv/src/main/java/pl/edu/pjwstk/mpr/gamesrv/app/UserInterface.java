package pl.edu.pjwstk.mpr.gamesrv.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractListModel;
import javax.swing.JTable;

public class UserInterface {

	protected JFrame frame;
	protected JTextField txtLogin;
	protected JTextField txtPass;
	protected JTextField txtHp;
	protected JTextField txtMaxhp;
	protected JTextField txtStrength;
	protected JTextField txtMaxstrength;
	protected JTextField txtDexterity;
	protected JTextField txtMaxdexterity;
	protected JTextField txtMana;
	protected JTextField txtMaxmana;
	protected JLabel lblMaxStrength;
	protected JLabel lblDexterity;
	protected JLabel lblMaxDexterity;
	protected JLabel lblMana;
	protected JLabel lblMaxMana;
	protected JTextField txtPosx;
	protected JTextField txtPosy;
	protected JTextField txtPosz;
	protected JTextField txtAnglex;
	protected JTextField txtAngley;
	protected JTextField txtAnglez;
	protected JLabel lblPosX;
	protected JLabel lblPosY;
	protected JLabel lblPosZ;
	protected JLabel lblAngleX;
	protected JLabel lblAngleY;
	protected JLabel lblAngleZ;
	protected JComboBox item_to_inv, player_list;
	JButton btnSave, btnRemove, btnEdit,btnNew;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public UserInterface() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelAddPlayer = new JPanel();
		tabbedPane.addTab("Players", null, panelAddPlayer, null);
		panelAddPlayer.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setText("login");
		txtLogin.setBounds(113, 38, 114, 19);
		panelAddPlayer.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setText("pass");
		txtPass.setBounds(113, 69, 114, 19);
		panelAddPlayer.add(txtPass);
		txtPass.setColumns(10);
		
		txtHp = new JTextField();
		txtHp.setText("hp");
		txtHp.setBounds(113, 100, 114, 19);
		panelAddPlayer.add(txtHp);
		txtHp.setColumns(10);
		
		txtMaxhp = new JTextField();
		txtMaxhp.setText("max_hp");
		txtMaxhp.setBounds(113, 131, 114, 19);
		panelAddPlayer.add(txtMaxhp);
		txtMaxhp.setColumns(10);
		
		txtStrength = new JTextField();
		txtStrength.setText("strength");
		txtStrength.setBounds(113, 162, 114, 19);
		panelAddPlayer.add(txtStrength);
		txtStrength.setColumns(10);
		
		txtMaxstrength = new JTextField();
		txtMaxstrength.setText("max_strength");
		txtMaxstrength.setBounds(113, 193, 114, 19);
		panelAddPlayer.add(txtMaxstrength);
		txtMaxstrength.setColumns(10);
		
		txtDexterity = new JTextField();
		txtDexterity.setText("dexterity");
		txtDexterity.setBounds(113, 224, 114, 19);
		panelAddPlayer.add(txtDexterity);
		txtDexterity.setColumns(10);
		
		txtMaxdexterity = new JTextField();
		txtMaxdexterity.setText("max_dexterity");
		txtMaxdexterity.setBounds(113, 255, 114, 19);
		panelAddPlayer.add(txtMaxdexterity);
		txtMaxdexterity.setColumns(10);
		
		txtMana = new JTextField();
		txtMana.setText("mana");
		txtMana.setBounds(113, 286, 114, 19);
		panelAddPlayer.add(txtMana);
		txtMana.setColumns(10);
		
		txtMaxmana = new JTextField();
		txtMaxmana.setText("max_mana");
		txtMaxmana.setBounds(113, 317, 114, 19);
		panelAddPlayer.add(txtMaxmana);
		txtMaxmana.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(12, 38, 70, 15);
		panelAddPlayer.add(lblLogin);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(12, 69, 70, 15);
		panelAddPlayer.add(lblPass);
		
		JLabel lblHp = new JLabel("Hp");
		lblHp.setBounds(12, 100, 70, 15);
		panelAddPlayer.add(lblHp);
		
		JLabel lblMaxHp = new JLabel("Max hp");
		lblMaxHp.setBounds(12, 131, 70, 15);
		panelAddPlayer.add(lblMaxHp);
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setBounds(12, 162, 70, 15);
		panelAddPlayer.add(lblStrength);
		
		lblMaxStrength = new JLabel("Max strength");
		lblMaxStrength.setBounds(12, 195, 94, 15);
		panelAddPlayer.add(lblMaxStrength);
		
		lblDexterity = new JLabel("Dexterity");
		lblDexterity.setBounds(12, 226, 70, 15);
		panelAddPlayer.add(lblDexterity);
		
		lblMaxDexterity = new JLabel("Max dexterity");
		lblMaxDexterity.setBounds(12, 257, 96, 15);
		panelAddPlayer.add(lblMaxDexterity);
		
		lblMana = new JLabel("Mana");
		lblMana.setBounds(12, 288, 70, 15);
		panelAddPlayer.add(lblMana);
		
		lblMaxMana = new JLabel("Max mana");
		lblMaxMana.setBounds(12, 319, 83, 15);
		panelAddPlayer.add(lblMaxMana);
		
		txtPosx = new JTextField();
		txtPosx.setText("pos_x");
		txtPosx.setBounds(330, 38, 114, 19);
		panelAddPlayer.add(txtPosx);
		txtPosx.setColumns(10);
		
		txtPosy = new JTextField();
		txtPosy.setText("pos_y");
		txtPosy.setBounds(330, 69, 114, 19);
		panelAddPlayer.add(txtPosy);
		txtPosy.setColumns(10);
		
		txtPosz = new JTextField();
		txtPosz.setText("pos_z");
		txtPosz.setBounds(330, 100, 114, 19);
		panelAddPlayer.add(txtPosz);
		txtPosz.setColumns(10);
		
		txtAnglex = new JTextField();
		txtAnglex.setText("angle_x");
		txtAnglex.setBounds(330, 131, 114, 19);
		panelAddPlayer.add(txtAnglex);
		txtAnglex.setColumns(10);
		
		txtAngley = new JTextField();
		txtAngley.setText("angle_y");
		txtAngley.setBounds(330, 162, 114, 19);
		panelAddPlayer.add(txtAngley);
		txtAngley.setColumns(10);
		
		txtAnglez = new JTextField();
		txtAnglez.setText("angle_z");
		txtAnglez.setBounds(330, 193, 114, 19);
		panelAddPlayer.add(txtAnglez);
		txtAnglez.setColumns(10);
		
		lblPosX = new JLabel("Pos x");
		lblPosX.setBounds(245, 40, 70, 15);
		panelAddPlayer.add(lblPosX);
		
		lblPosY = new JLabel("Pos y");
		lblPosY.setBounds(245, 71, 70, 15);
		panelAddPlayer.add(lblPosY);
		
		lblPosZ = new JLabel("Pos z");
		lblPosZ.setBounds(245, 102, 70, 15);
		panelAddPlayer.add(lblPosZ);
		
		lblAngleX = new JLabel("Angle x");
		lblAngleX.setBounds(245, 133, 70, 15);
		panelAddPlayer.add(lblAngleX);
		
		lblAngleY = new JLabel("Angle y");
		lblAngleY.setBounds(245, 164, 70, 15);
		panelAddPlayer.add(lblAngleY);
		
		lblAngleZ = new JLabel("Angle z");
		lblAngleZ.setBounds(245, 195, 70, 15);
		panelAddPlayer.add(lblAngleZ);
		
		player_list = new JComboBox();
		player_list.setBounds(27, 2, 696, 24);
		panelAddPlayer.add(player_list);
		
		 btnSave = new JButton("Save");
		btnSave.setBounds(36, 377, 117, 25);
		panelAddPlayer.add(btnSave);
		
		 btnRemove = new JButton("Remove");
		btnRemove.setBounds(189, 377, 117, 25);
		panelAddPlayer.add(btnRemove);
		
		 btnEdit = new JButton("Edit");
		btnEdit.setBounds(344, 377, 117, 25);
		panelAddPlayer.add(btnEdit);
		
		 btnNew = new JButton("New");
		btnNew.setBounds(491, 377, 117, 25);
		panelAddPlayer.add(btnNew);
		
		item_to_inv = new JComboBox();
		item_to_inv.setBounds(473, 66, 245, 24);
		panelAddPlayer.add(item_to_inv);
		
		JLabel lblSelectItemTo = new JLabel("Select item to insert into player inventory");
		lblSelectItemTo.setFont(new Font("Dialog", Font.BOLD, 10));
		lblSelectItemTo.setBounds(473, 41, 260, 15);
		panelAddPlayer.add(lblSelectItemTo);
	}
}
