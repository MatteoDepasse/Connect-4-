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
	boolean blnturn;
	String strP1 = "X";
	String strP2 = "O";
	String strBoard[][];
	String strEmpty = ".";
	int intColumn = 0; 
	int intRow = 0;
	int intWin = 0;
	int intCount = 0;
	
	// Methods
	public void paintComponent(Graphics g){
		tools.plainboard(g);
		tools.board(g);
		
		strBoard = new String[7][6];
		
		for(intColumn = 0; intColumn < 7; intColumn++){
			for(intRow = 0; intRow < 6; intRow++){
				strBoard[intColumn][intRow] = strEmpty;
			}
		}
		
	//	for(intCount = 0; intWin == 0; intCount++){
			strP1 = tools.P1piece(g, intX, strBoard, strP1, strP2, strEmpty, classicred);
			intWin = tools.P1win(intWin, strP1, strP2, strEmpty, strBoard);
			
			if(intWin != 1){
				strP2 = tools.P2piece(g, intX, strBoard, strP1, strP2, strEmpty, classicred);
				intWin = tools.P2win(intWin, strP1, strP2, strEmpty, strBoard);
			}
	//	}
		
		if(intWin == 1){
			g.drawString("You Win!", 550, 40);
		}
		if(intWin == 2){
			g.drawString("You Win!", 550, 40);
		}
		
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
	
