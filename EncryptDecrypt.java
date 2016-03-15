import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class EncryptDecrypt extends JPanel{

	private JLabel title;
	
	EncryptDecrypt() {
		setLayout(new FlowLayout());
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		setSize(100, 100);
		
		title = new JLabel("Encrypt/Decrypt File");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
	}
	
	public void encryptFile() {
		
	}
	
	public void decryptFile() {
		
	}
	
	public RSAAlgorithm getRSAAlgorithm() {
		
		return null;
	}
}
