import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class UnblockFile extends JPanel {

	private JLabel title;
	
	UnblockFile() {
		setLayout(new GridLayout(2,0));
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		setSize(500, 100);
		
		title = new JLabel("Unblock File");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);
	}
}
