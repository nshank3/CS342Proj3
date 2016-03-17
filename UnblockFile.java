import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class UnblockFile extends JPanel {

	private JLabel title;
	private JButton unblockFileButton;
	
	UnblockFile() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		title = new JLabel("Unblock File");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
		
		unblockFileButton = new JButton("Unblock File");
		add(unblockFileButton);
		
	}
}
