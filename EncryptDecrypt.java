import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class EncryptDecrypt extends JPanel{
	private JLabel title;
	private JFileChooser fileManager;
	private JButton encryptButton;
	private JButton decryptButton;
	
	EncryptDecrypt() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		fileManager = new JFileChooser();
		
		title = new JLabel("Encrypt/Decrypt File");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
		
		encryptButton = new JButton("Encrypt Block File");
		add(encryptButton);
		
		decryptButton = new JButton("Decrypt Block File");
		add(decryptButton);
		
		enableActionListeners();
	}
	
	public void encryptFile() {
		fileManager.showOpenDialog(encryptButton);
		fileManager.getSelectedFile().getAbsolutePath();
	}
	
	public void decryptFile() {
		fileManager.showOpenDialog(decryptButton);
		fileManager.getSelectedFile().getAbsolutePath();
	}
	
	public RSAAlgorithm getRSAAlgorithm() {
		
		return null;
	}
	
	public void enableActionListeners() {
		
		encryptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptFile();
			}
		});
		
		decryptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptFile();
			}
		});
	}
}
