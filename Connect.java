import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
// Made by Matteo and Kevin 

public class Connect implements ActionListener, MouseMotionListener{
	// Properties
	
	//need a :
	//network panel
	//play panel
	//themes panel
	//highscore panel
	//
	JFrame theframe;
	AnimationPanel thepanel;
	AnimationPanel2 thepanel2; 
	JButton butPLAY; 
	JButton butSCORE;
	JButton butTHEME;
	JButton butHOWTO;
	JButton butEXIT;
	JButton butBACK;
	Timer thetimer; 
	JLabel thelabel; 
	JLabel thelabel2; 
	JLabel thelabel3; 
	JLabel thelabel4; 
	JLabel thelabel5; 


	String strHow = ""; 

	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()== butHOWTO){
			theframe.setContentPane(thepanel2);
			
			thelabel.setText("Once you click play the game will ask you if you want to be a client or host"); 
			thelabel2.setText("Choose client or host,the host has to provides the port number and the ip address while the client enters it"); 
			thelabel3.setText("While playing the turns alternate between red and yellow team"); 
			thelabel4.setText("Drag and drop your pieces to drop them down a column");
			thelabel5.setText("Line 4 pieces of your colour to win the game!!");

			//
			//System.out.println("Once you click play the game will ask you if you want to be a client or host");
		//	System.out.println("Choose client or host");
		//	System.out.println("the host has to provides the port number and the ip address");
		}
		if(evt.getSource()== butBACK){
			theframe.setContentPane(thepanel);
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
		
		thepanel2 = new AnimationPanel2();
		thepanel2.setLayout(null);
		thepanel2.setPreferredSize(new Dimension(1280,720));
		
		butPLAY = new JButton("PLAY");
		butSCORE = new JButton("HIGH SCORE");
		butTHEME = new JButton("THEMES");
		butHOWTO = new JButton("HOW TO PLAY");
		butEXIT = new JButton("EXIT");
		butBACK = new JButton("BACK");
		butPLAY.addActionListener(this);
		butSCORE.addActionListener(this);
		butTHEME.addActionListener(this);
		butHOWTO.addActionListener(this);
		butEXIT.addActionListener(this);
		butBACK.addActionListener(this);
		thetimer = new Timer(1000/60, this);
		thetimer.start(); 
		thelabel = new JLabel("");
		thelabel.setSize(1000,50);
		thelabel.setLocation(0,0);
		
		thelabel2 = new JLabel("");
		thelabel2.setSize(1000,50);
		thelabel2.setLocation(0,50);
		
		thelabel3 = new JLabel("");
		thelabel3.setSize(1000,50);
		thelabel3.setLocation(0,100);
		
		thelabel4 = new JLabel("");
		thelabel4.setSize(1000,50);
		thelabel4.setLocation(0,150);
		
		thelabel5 = new JLabel("");
		thelabel5.setSize(1000,50);
		thelabel5.setLocation(0,200);



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
		butBACK.setSize(100,50); 
		butBACK.setLocation(0,300);
		
		thepanel.add(butPLAY);
		thepanel.add(butSCORE);
		thepanel.add(butTHEME);
		thepanel.add(butHOWTO);
		thepanel.add(butEXIT);
		thepanel.add(thelabel);
		
		thepanel2.add(thelabel); 
		thepanel2.add(thelabel2);
		thepanel2.add(thelabel3);
		thepanel2.add(thelabel4);
		thepanel2.add(thelabel5);
		thepanel2.add(butBACK);

		
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
