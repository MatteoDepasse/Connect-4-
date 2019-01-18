import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel5 extends JPanel{

	// Properties
	
		boolean blnFileFail = false;
		FileReader thefile = null;
		BufferedReader thefiledata = null;
		int intX = 10;
		int intY = 50;
		int intTop = 0; 
	
	// Methods
	public void paintComponent(Graphics g){
		tools.plainboard(g);
		revalidate();
		
		//
		try{
			thefile = new FileReader("score.txt");
		}catch(FileNotFoundException e){
			System.out.println("Unable to read from the file...");
			blnFileFail = true;
		}
		if(blnFileFail == false){
			thefiledata = new BufferedReader(thefile);
			String strLine = "";

			try{
				strLine = thefiledata.readLine();
			}catch(IOException e){
				strLine = "0";
			}

			while(strLine != null && intTop < 10){
				g.setColor(Color.BLACK);
				intY = intY + 30;
				intTop = intTop + 1;
				g.drawString(strLine, 600, intY);
				g.drawString("HIGHSCORE (least amount of moves to win)",550,40);
				g.drawString("1.",570,80);
				g.drawString("2.",570,140);
				g.drawString("3.",570,200);
				g.drawString("4.",570,260);
				g.drawString("5.",570,320);
				

				try{
					strLine = thefiledata.readLine();
				}catch(IOException e){
					strLine = "0";
				}
			}
		}
		
	}

	
	// Constructor
	public AnimationPanel5(){
		super();
	}
}
	
