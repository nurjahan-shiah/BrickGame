package project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartScreen extends JPanel{
	
//make the constructor 
	public StartScreen() {
		JLabel level = new JLabel ("Level 1", SwingConstants.CENTER);
		JLabel lockedLevels = new JLabel ("Locked Levels:4", SwingConstants.CENTER);
		//JButton startButton = new JButton ("Start");
		
		
		
		setLayout(new GridLayout(3,1));
		add(level);
		add(lockedLevels);
		//add(startButton);
	}
	
	public StartScreen (BrickGame game) {
		JButton startButton = new JButton ("Start");
		startButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				game.paint(getGraphics());
				
			}
			
		});
		add(startButton);
	}
}
