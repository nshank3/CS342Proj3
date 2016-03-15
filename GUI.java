import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUI extends JFrame{
	private BlockFile blockFile;
	private EncryptDecrypt encryptDecrypt;
	private UnblockFile unblockFile;
	private KeyCreation keyCreation;
	
	private GUIMenu menuBar;
	
	
	GUI() {
		// Initialize the GUI with specified settings.
		setTitle("RSA Encrpytion/Decryption");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		setSize(400, 400);
		setResizable(true);
		menuBar = new GUIMenu();
		setJMenuBar(menuBar);
		
		// Creates the primary panels to add to the GUI.
		keyCreation = new KeyCreation();
		blockFile = new BlockFile();
		unblockFile = new UnblockFile();
		encryptDecrypt = new EncryptDecrypt();
		
		// Adds the primary panels to the GUI.
		add(keyCreation);
		add(blockFile);
		add(unblockFile);
		add(encryptDecrypt);
		
		// Sets the GUI Visible.
		setVisible(true);
	}
	
	public static void main(String [] argv) {
		GUI gui = new GUI();
	}
}
