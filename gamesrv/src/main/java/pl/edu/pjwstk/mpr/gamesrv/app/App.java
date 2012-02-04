package pl.edu.pjwstk.mpr.gamesrv.app;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventHandler window = new EventHandler();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
