import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class KeyCreation extends JPanel {
	private JFileChooser fileManager;
	private Scanner fileScanner;
	private File file;
	private MyInt pNumber;
	private MyInt qNumber;
	private RSAAlgorithm rsa;
	
	private JButton pNumberButton;
	private JButton qNumberButton;
	private JTextField pTextField;
	private JTextField qTextField;
	private JLabel title;

	
	
	KeyCreation() {
		setLayout(new GridLayout(5, 0));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		setSize(500, 100);
		
		fileManager = new JFileChooser();
		title = new JLabel("Key Creation");
		pNumberButton = new JButton("Load P Prime Number");
		qNumberButton = new JButton("Load Q Prime Number");
		pTextField = new JTextField();
		pTextField.setSize(100, 100);
		qTextField = new JTextField();
		
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
		add(pTextField);
		add(pNumberButton);
		add(qTextField);
		add(qNumberButton);
		
		enableActionListener();
	}
	
	public String getPublicKey() {
		
		return null;
	}
	
	public String getPrivateKey() {
		
		return null;
	}
	
	public RSAAlgorithm getRSAAlgorithm() {
		
		return null;
	}
	
	public void savePublicKey() {
		String publicKeyBuilder = "";
		publicKeyBuilder += "<rsakey>\n";
		publicKeyBuilder += "<evalue>" + rsa.getENumber() + "</evalue>\n";
		publicKeyBuilder += "<nvalue>" + rsa.getNNumber() + "</nvalue\n";
		publicKeyBuilder += "</rsakey>\n";
		
	}
	
	public void savePrivateKey() {
		String privateKeyBuilder = "";
		privateKeyBuilder += "<rsakey>\n";
		privateKeyBuilder += "<dvalue>" + rsa.getDNumber() + "</dvalue>\n";
		privateKeyBuilder += "<nvalue>" + rsa.getNNumber() + "</nvalue\n";
		privateKeyBuilder += "</rsakey>\n";
	}
	
	public String loadPrimeNumber() {
		
		return null;
	}
	
	public void enableActionListener() {
		pNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileManager.showOpenDialog(pNumberButton);
				String fileLocation = fileManager.getSelectedFile().getAbsolutePath();
				fileScanner = new Scanner(fileLocation);
			}
		});
		
		qNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileManager.showOpenDialog(pNumberButton);
				String fileLocation = fileManager.getSelectedFile().getAbsolutePath();
				fileScanner = new Scanner(fileLocation);
			}
		});
	}
}
