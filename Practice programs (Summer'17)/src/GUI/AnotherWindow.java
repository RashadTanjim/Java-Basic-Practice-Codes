import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnotherWindow{

	// declare all the components
	JFrame frame;
	JLabel message;
	
	public AnotherWindow(){
		// initialize the components
		frame = new JFrame();
		
		
		message = new JLabel("This is another window");
		
		
		GridLayout g = new GridLayout(1, 1);
		frame.setLayout(g);
		
		
		// add the component into the frame
		
		frame.add(message);
		
		
		// now display the frame
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setTitle("Another Window");
		
	}
	

	
	

	
	
	
	
	
}