import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
// Made by Matteo and Kevin 

public class Connect{
	// Properties
	JFrame theframe;
	AnimationPanel thepanel;
	
	// Methods

	// Constructor
	public Connect(){
		theframe = new JFrame("Connect 4");
		thepanel = new AnimationPanel();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280,720));
		
		theframe.setContentPane(thepanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
	}
	// Main Method
public static void main (String[] args){
	new Connect();
	}
} 
