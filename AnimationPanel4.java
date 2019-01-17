import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel4 extends JPanel{

	// Properties
	BufferedImage classicred;
	BufferedImage classicyellow;
	BufferedImage industrialscrew;
	BufferedImage industrialnut;
	BufferedImage spacemoon;
	BufferedImage spacestar;
	int intX = 350;
	int intY = 550;
	boolean blnclassic = true;
	boolean blnspace = false;
	boolean blnindustrial = false;
	boolean blnturn = true;
	
	// Methods
	public void paintComponent(Graphics g){
		tools.plainboard(g);
		tools.board(g);
		
		if(blnclassic = true){
			if(blnturn = true){
				g.drawImage(classicred, intX, intY, null);
			}else if(blnturn = false){
				g.drawImage(classicyellow, intX, intY, null);
			}
		}else if(blnspace = true){
			if(blnturn = true){
				g.drawImage(spacemoon, intX, intY, null);
			}else if(blnturn = false){
				g.drawImage(spacestar, intX, intY, null);
			}
		}else if(blnindustrial = true){
			if(blnturn = true){
				g.drawImage(industrialnut, intX, intY, null);
			}else if(blnturn = false){
				g.drawImage(industrialscrew, intX, intY, null);
			}
		}
		
	}
	
	// Constructor
	public AnimationPanel4(){
		super();
		try{
			classicred = ImageIO.read(new File("classicred.png"));
			classicyellow = ImageIO.read(new File("classicyellow.png"));
			spacemoon = ImageIO.read(new File("spacemoon.png"));
			spacestar = ImageIO.read(new File("spacestar.png"));
			industrialnut = ImageIO.read(new File("industrialnut.png"));
			industrialscrew = ImageIO.read(new File("industrialscrew.png"));
		}catch(IOException e){
			System.out.println("Unable to load");
		}
	}
}
	
