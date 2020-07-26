package guip;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
 
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI () {
	
		frame = new JFrame();
		
		JButton button = new JButton("Click me!"); // we can keep the button here. 
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
		
	public static void main(String[] args) {
		
// GUI : Graphical User Interface.
// There are million ways to  make GUI depends on what language you're using. An easy way to make a GUI in java is with 'swing'.  
// 'Swing' is out-dated,but popular and a good way to start learning.Swing has code that lets us call methods with GUI objects to make our own GUI. 		
		
		new GUI();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		label.setText("Number of clicks: " + count);
	}
	
}
