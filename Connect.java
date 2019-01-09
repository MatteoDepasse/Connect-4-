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
	JButton butPLAY; 
	JButton butSCORE;
	JButton butTHEME;
	JButton butHOWTO;
	JButton butEXIT;
	JButton butBACK;
	Timer thetimer; 
	JLabel thelabel; 
	String strHow = ""; 

	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()== butHOWTO){
			thepanel.blnClear = true; 
			//thepanel.add(thelabel);
			thelabel.setText("here"); 
			//
			//System.out.println("Once you click play the game will ask you if you want to be a client or host");
		//	System.out.println("Choose client or host");
		//	System.out.println("the host has to provides the port number and the ip address");
		}
		if(evt.getSource()==thetimer){
			thepanel.repaint();
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
		butPLAY = new JButton("PLAY");
		butSCORE = new JButton("HIGH SCORE");
		butTHEME = new JButton("THEMES");
		butHOWTO = new JButton("HOW TO PLAY");
		butEXIT = new JButton("EXIT");
		butPLAY.addActionListener(this);
		butSCORE.addActionListener(this);
		butTHEME.addActionListener(this);
		butHOWTO.addActionListener(this);
		butEXIT.addActionListener(this);
		thetimer = new Timer(1000/60, this);
		thetimer.start(); 
		thelabel = new JLabel("");
		thelabel.setSize(100,100);
		thelabel.setLocation(300,300);


		butPLAY.setSize(100,50); 
		butPLAY.setLocation(0,0);
		butSCORE.setSize(100,50); 
		butSCORE.setLocation(0,50);
		butTHEME.setSize(100,50); 
		butTHEME.setLocation(0,100);
		butHOWTO.setSize(100,50); 
		butHOWTO.setLocation(0,150);
		butEXIT.setSize(100,50); 
		butEXIT.setLocation(0,200);
		
		thepanel.add(butPLAY);
		thepanel.add(butSCORE);
		thepanel.add(butTHEME);
		thepanel.add(butHOWTO);
		thepanel.add(butEXIT);
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
