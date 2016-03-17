import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class BlockFile extends JPanel{
	private JFileChooser fileManager;
	private Scanner fileScanner;
	private String message;
	private String blockFile;
	private int blockSize;
	
	private JLabel title;
	private JButton loadFileButton;
	
	BlockFile() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		title = new JLabel("Block File");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
		
		loadFileButton = new JButton("Load Block File");
		add(loadFileButton);

		enableActionListeners();
	}
	
	public void createBlockFile(int blockSize) {
		
	}
	
	public String getBlockFile() {
		
		return null;
	}
	
	public void enableActionListeners() {
	}
}