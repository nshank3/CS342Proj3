import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GUIMenu extends JMenuBar{
	private JMenu file;
	private JMenu help;
	private JMenuItem exitItem;
	private JMenuItem helpItem;
	private JMenuItem aboutItem;
	
	private String aboutMessage = "CS342 Project 3 RSA Encryption/Decryption\n"+
								  "Team Members\nDaniel Hajnos\nNikhil Shanker";
	
	private String helpMessage = "Still need to write help message";
	
	GUIMenu() {
		file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_E);
		file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic(KeyEvent.VK_E);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		helpItem = new JMenuItem("Help");
		helpItem.setMnemonic(KeyEvent.VK_H);
		helpItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(help, helpMessage);
			}
		});
		
		aboutItem = new JMenuItem("About");
		aboutItem.setMnemonic(KeyEvent.VK_A);
		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(help, aboutMessage);
			}
		});
		
		file.add(exitItem);
		help.add(helpItem);
		help.add(aboutItem);
		
		
		add(file);
		add(help);
	}

}
