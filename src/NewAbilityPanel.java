import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NewAbilityPanel extends JPanel{

	JLabel nameLabel, minDamageLabel, maxDamageLabel;
	JTextField nameField, minDamageField, maxDamageField;
	
	public NewAbilityPanel()
	{
		this.setLayout(new FlowLayout());
		
		nameLabel = new JLabel("Ability Name: ");
		nameField = new JTextField(20);
		
		minDamageLabel = new JLabel("Minimum Damage: ");
		minDamageField = new JTextField(10);
		
		maxDamageLabel = new JLabel("Maximum Damage: ");
		maxDamageField = new JTextField(10);
		
		this.add(nameLabel);
		this.add(nameField);
		this.add(minDamageLabel);
		this.add(minDamageField);
		this.add(maxDamageLabel);
		this.add(maxDamageField);
	}

}
