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
	private String pNumber;
	private String qNumber;
	private RSAAlgorithm rsa;
	
	private JButton primeNumberButton;

	private JTextField pTextField;
	private JTextField qTextField;
	private JLabel title;

	
	
	KeyCreation() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		fileManager = new JFileChooser();
		title = new JLabel("Key Creation");
		primeNumberButton = new JButton("Load Prime Numbers");
		
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
		add(primeNumberButton);

		enableActionListener();
	}
	
	public RSAAlgorithm getRSAAlgorithm() {	
		return rsa;
	}
	
	public void saveKeys() {
		
		
		
		rsa = new RSAAlgorithm(pNumber, qNumber);
		String puKey = savePublicKey();
		String prKey = savePrivateKey();
		
	}
	
	public String savePublicKey() {
		String publicKeyBuilder = "";
		publicKeyBuilder += "<rsakey>\n";
		publicKeyBuilder += "<evalue>" + rsa.getENumber() + "</evalue>\n";
		publicKeyBuilder += "<nvalue>" + rsa.getNNumber() + "</nvalue\n";
		publicKeyBuilder += "</rsakey>\n";
		
		return publicKeyBuilder;
	}
	
	public String savePrivateKey() {
		String privateKeyBuilder = "";
		privateKeyBuilder += "<rsakey>\n";
		privateKeyBuilder += "<dvalue>" + rsa.getDNumber() + "</dvalue>\n";
		privateKeyBuilder += "<nvalue>" + rsa.getNNumber() + "</nvalue\n";
		privateKeyBuilder += "</rsakey>\n";
		
		return privateKeyBuilder;
	}
	
	public String loadPrimeNumber() {
		file = new File(fileManager.getSelectedFile().getAbsolutePath());

		return null;
	}
	
	public void enableActionListener() {
		primeNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileManager.showOpenDialog(primeNumberButton);
				String fileLocation = fileManager.getSelectedFile().getAbsolutePath();
				fileScanner = new Scanner(fileLocation);
				fileManager.showSaveDialog(primeNumberButton);
			}
		});

	}
}
