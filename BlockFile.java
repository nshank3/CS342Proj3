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
	
	private JTextField blockSizeInput;
	private JLabel title;
	private JButton loadFileButton;
	private JButton saveBlockFileButton;
	
	BlockFile() {
		setLayout(new GridLayout(4,0));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		setSize(500, 100);
		
		title = new JLabel("Block File");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
		
		blockSizeInput = new JTextField();
		add(blockSizeInput);
		
		loadFileButton = new JButton("Load Block File");
		add(loadFileButton);
		
		saveBlockFileButton = new JButton("Save Block File");
		add(saveBlockFileButton);
		
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