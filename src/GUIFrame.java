import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class GUIFrame implements ActionListener{

	NewAbilityPanel newAbilityPanel;
	JFrame mainFrame;
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem exportItem, importItem;
	
	ArrayList<Ability> abilityList;
	XMLEncoder e;
	
	public GUIFrame()
	{
		abilityList = new ArrayList<Ability>();
		try {
			e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("data/test.xml")));
		}
		catch (Exception e) {
			System.out.println("Something went wrong with XML encoder");
		}
		abilityList.add(new Ability("test name", 5, 10));
		
		mainFrame = new JFrame("title");
		mainFrame.setSize(new Dimension(800,600));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		importItem = new JMenuItem("Import...");
		fileMenu.add(importItem);
		exportItem = new JMenuItem("Export...");
		exportItem.addActionListener(this);
		fileMenu.add(exportItem);
		menuBar.add(fileMenu);
		mainFrame.setJMenuBar(menuBar);
		
		newAbilityPanel = new NewAbilityPanel();
		mainFrame.add(newAbilityPanel);
		
		mainFrame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		GUIFrame window = new GUIFrame();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//System.out.println(ae.getSource());
		if(ae.getSource() == exportItem)
		{
			System.out.println("yea");
			
		}
		Ability a = new Ability("test name", 5, 10);
		e.writeObject(abilityList);
		e.close();
	}
}
