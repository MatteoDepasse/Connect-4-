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
	JButton butBACK2;
	JButton butBACK3;
	JButton butBACK4;
	JButton butBACK5;
	JButton buttheme1;
	JButton buttheme2;
	JButton buttheme3;
	JButton butNEXT;
	JRadioButton client;
	JRadioButton host;
	Timer thetimer; 
	JLabel thelabel; 
	JLabel thelabel2; 
	JLabel thelabel3; 
	JLabel thelabel4; 
	JLabel thelabel5; 
	JLabel thelabel6;
	SuperSocketMaster ssm;

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
		if(evt.getSource()== butSCORE){
			theframe.setContentPane(highpanel);
		}
		if(evt.getSource()== butTHEME){
			theframe.setContentPane(themepanel);
			thelabel6.setText("Select a Theme");
		}
		if(evt.getSource()== buttheme1){
			buttheme1.setEnabled(false);
			buttheme2.setEnabled(true);
			buttheme3.setEnabled(true);
			tools.pieces(1);
		}
		if(evt.getSource()== buttheme2){
			buttheme2.setEnabled(false);
			buttheme1.setEnabled(true);
			buttheme3.setEnabled(true);
			tools.pieces(2);
		}
		if(evt.getSource()== buttheme3){
			buttheme3.setEnabled(false);
			buttheme1.setEnabled(true);
			buttheme2.setEnabled(true);
			tools.pieces(3);
			
		}
		if(evt.getSource()== butBACK){
			theframe.setContentPane(mainpanel);
		}
		if(evt.getSource()== butBACK2){
			theframe.setContentPane(mainpanel);
		}
		if(evt.getSource()== butBACK3){
			theframe.setContentPane(mainpanel);
		}
		if(evt.getSource()== butBACK4){
			theframe.setContentPane(mainpanel);
		}
		if(evt.getSource()== butBACK5){
			theframe.setContentPane(netpanel);
			System.out.println("test");
		}
		if(evt.getSource()== butNEXT){
			theframe.setContentPane(playpanel);
		}
		if(evt.getSource()== butEXIT){
			theframe.dispatchEvent(new WindowEvent(theframe, WindowEvent.WINDOW_CLOSING));
		}
		if(evt.getSource() == client){
			if(client.isSelected()){
				host.setSelected(false);
			}else{
				host.setSelected(true);
			}
		}else if(evt.getSource() == host){
			if(host.isSelected()){
				client.setSelected(false);
			}else{
				client.setSelected(true);
			}
		}
		if(evt.getSource()== thetimer){
			mainpanel.repaint();
			netpanel.revalidate();
			highpanel.revalidate();
			themepanel.revalidate();
			playpanel.revalidate();
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
		
		highpanel = new AnimationPanel5();
		highpanel.setLayout(null);
		highpanel.setPreferredSize(new Dimension(1280,720));
		
		themepanel = new AnimationPanel6();
		themepanel.setLayout(null);
		themepanel.setPreferredSize(new Dimension(1280,720));
		
		client = new JRadioButton("Client");
		client.addActionListener(this);
		client.setSize(100,100);
		client.setLocation(550,100); 
		client.setEnabled(true);
		
		host = new JRadioButton("Host");
		host.addActionListener(this);
		host.setSize(100,100);
		host.setLocation(650,100); 
		
		butPLAY = new JButton("PLAY");
		butSCORE = new JButton("HIGH SCORE");
		butTHEME = new JButton("THEMES");
		butHOWTO = new JButton("HOW TO PLAY");
		butEXIT = new JButton("EXIT");
		butBACK = new JButton("BACK");
		butBACK2 = new JButton("BACK");
		butBACK3 = new JButton("BACK");
		butBACK4 = new JButton("BACK");
		butBACK5 = new JButton("BACK");
		buttheme1 = new JButton("CLASSIC");
		buttheme2 = new JButton("SPACE");
		buttheme3 = new JButton("INDUSTRIAL");
		butNEXT = new JButton("NEXT");
		butPLAY.addActionListener(this);
		butSCORE.addActionListener(this);
		butTHEME.addActionListener(this);
		butHOWTO.addActionListener(this);
		butEXIT.addActionListener(this);
		butBACK.addActionListener(this);
		butBACK2.addActionListener(this);
		butBACK3.addActionListener(this);
		butBACK4.addActionListener(this);
		butBACK5.addActionListener(this);
		buttheme1.addActionListener(this);
		buttheme2.addActionListener(this);
		buttheme3.addActionListener(this);
		butNEXT.addActionListener(this);
		
		thetimer = new Timer(1000/60, this);
		thetimer.start();
		 
		thelabel = new JLabel("");
		thelabel.setSize(1000,50);
		thelabel.setLocation(100,0);
		
		thelabel2 = new JLabel("");
		thelabel2.setSize(1000,50);
		thelabel2.setLocation(100,50);
		
		thelabel3 = new JLabel("");
		thelabel3.setSize(1000,50);
		thelabel3.setLocation(100,100);
		
		thelabel4 = new JLabel("");
		thelabel4.setSize(1000,50);
		thelabel4.setLocation(100,150);
		
		thelabel5 = new JLabel("");
		thelabel5.setSize(1000,50);
		thelabel5.setLocation(100,200);
		
		thelabel6 = new JLabel("");
		thelabel6.setSize(1000,50);
		thelabel6.setLocation(600,100);

		butPLAY.setSize(100,50); 
		butPLAY.setLocation(200,100);
		
		butSCORE.setSize(100,50); 
		butSCORE.setLocation(200,200);
		
		butTHEME.setSize(100,50); 
		butTHEME.setLocation(200,300);
		
		butHOWTO.setSize(100,50); 
		butHOWTO.setLocation(200,400);
		
		butEXIT.setSize(100,50); 
		butEXIT.setLocation(200,500);
		
		butBACK.setSize(100,50); 
		butBACK.setLocation(20,650);
		
		butBACK2.setSize(100,50);
		butBACK2.setLocation(20,650);
		
		butBACK3.setSize(100,50);
		butBACK3.setLocation(20,650);
		
		butBACK4.setSize(100,50);
		butBACK4.setLocation(20,650);
		
		butBACK5.setSize(100,50);
		butBACK5.setLocation(20,650);
		
		buttheme1.setSize(100,50);
		buttheme1.setLocation(600,200);
		
		buttheme2.setSize(100,50);
		buttheme2.setLocation(600,300);
		
		buttheme3.setSize(100,50);
		buttheme3.setLocation(600,400);
		
		butNEXT.setSize(100,50);
		butNEXT.setLocation(1160,650);

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
		netpanel.add(butBACK3);
		netpanel.add(butNEXT);
		
		themepanel.add(thelabel6);
		themepanel.add(butBACK2);
		themepanel.add(buttheme1);
		themepanel.add(buttheme2);
		themepanel.add(buttheme3);
		
		highpanel.add(butBACK4);
		
		playpanel.add(butBACK5);
		
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
