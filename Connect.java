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
	AnimationPanel mainpanel;
	AnimationPanel2 helppanel;
	AnimationPanel3 netpanel;
	AnimationPanel4 playpanel;
	AnimationPanel5 highpanel; 
	AnimationPanel6 themepanel;
	JButton butPLAY; 
	JButton butSCORE;
	JButton butTHEME;
	JButton butHOWTO;
	JButton butEXIT;
	JButton butBACK;
	JRadioButton client;
	JRadioButton host;
	Timer thetimer; 
	JLabel thelabel; 
	JLabel thelabel2; 
	JLabel thelabel3; 
	JLabel thelabel4; 
	JLabel thelabel5; 

	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()== butHOWTO){
			theframe.setContentPane(helppanel);
			thelabel.setText("Once you click play the game will ask you if you want to be a client or host"); 
			thelabel2.setText("Choose client or host,the host has to provides the port number and the ip address while the client enters it"); 
			thelabel3.setText("While playing the turns alternate between red and yellow team"); 
			thelabel4.setText("Drag and drop your pieces to drop them down a column");
			thelabel5.setText("Line 4 pieces of your colour to win the game!!");
		}
		if(evt.getSource()== butPLAY){
			theframe.setContentPane(netpanel);
		}
		if(evt.getSource()== butBACK){
			theframe.setContentPane(mainpanel);
		}
		if(evt.getSource()== butEXIT){
			theframe.dispatchEvent(new WindowEvent(theframe, WindowEvent.WINDOW_CLOSING));
		}
		if(evt.getSource()== thetimer){
			mainpanel.repaint();
			netpanel.repaint();
		}
	}
	public void mouseDragged(MouseEvent evt){
		
	}
	public void mouseMoved(MouseEvent evt){
		
	} 
	// Constructor
	public Connect(){
		theframe = new JFrame("Connect 4");
		mainpanel = new AnimationPanel();
		mainpanel.setLayout(null);
		mainpanel.setPreferredSize(new Dimension(1280,720));
		
		helppanel = new AnimationPanel2();
		helppanel.setLayout(null);
		helppanel.setPreferredSize(new Dimension(1280,720));
		
		netpanel = new AnimationPanel3();
		netpanel.setLayout(null);
		netpanel.setPreferredSize(new Dimension(1280,720));
		
		playpanel = new AnimationPanel4();
		playpanel.setLayout(null);
		playpanel.setPreferredSize(new Dimension(1280,720));
		
		client = new JRadioButton("client");
		client.addActionListener(this);
		client.setSize(100,100);
		client.setLocation(0,100); 
		
		host = new JRadioButton("host");
		host.addActionListener(this);
		host.setSize(100,100);
		host.setLocation(100,100); 
		
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
		butBACK.setLocation(20,650);
		
		mainpanel.add(butPLAY);
		mainpanel.add(butSCORE);
		mainpanel.add(butTHEME);
		mainpanel.add(butHOWTO);
		mainpanel.add(butEXIT);
		mainpanel.add(thelabel);
		
		helppanel.add(thelabel); 
		helppanel.add(thelabel2);
		helppanel.add(thelabel3);
		helppanel.add(thelabel4);
		helppanel.add(thelabel5);
		helppanel.add(butBACK);
		
		netpanel.add(host);
		netpanel.add(client); 
		
		theframe.setContentPane(mainpanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);	
		
	}
	
	// Main Method
public static void main (String[] args){
	new Connect();
	}
} 
