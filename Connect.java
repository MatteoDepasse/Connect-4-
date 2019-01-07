import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
// Made by Matteo and Kevin 

public class Connect implements ActionListener, MouseMotionListener{
	// Properties
	JFrame theframe;
	AnimationPanel thepanel;
	JButton but1; 
	JButton but2;
	JButton but3;
	JButton but4;
	JButton but5;
	JButton but6;
	JLabel thelabel; 
	String strHow = ""; 

	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()== but4){
			 strHow = "test";
			 
		}
	}
	public void mouseDragged(MouseEvent evt){
		
	}
	public void mouseMoved(MouseEvent evt){
		
	} 
	// Constructor
	public Connect(){
		theframe = new JFrame("Connect 4");
		thepanel = new AnimationPanel();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280,720));
		but1 = new JButton("PLAY");
		but2 = new JButton("HIGH SCORE");
		but3 = new JButton("THEMES");
		but4 = new JButton("HOW TO PLAY");
		but5 = new JButton("EXIT");
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		thelabel = new JLabel(strHow);
		thelabel.setSize(100,100);
		thelabel.setLocation(400,400);


		but1.setSize(100,50); 
		but1.setLocation(0,0);
		but2.setSize(100,50); 
		but2.setLocation(0,50);
		but3.setSize(100,50); 
		but3.setLocation(0,100);
		but4.setSize(100,50); 
		but4.setLocation(0,150);
		but5.setSize(100,50); 
		but5.setLocation(0,200);
		
		thepanel.add(but1);
		thepanel.add(but2);
		thepanel.add(but3);
		thepanel.add(but4);
		thepanel.add(but5);
		thepanel.add(thelabel);
		
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
