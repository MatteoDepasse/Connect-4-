import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class tools{
	public static void board(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(550, 100, 685, 584);	
		g.setColor(Color.WHITE);
		g.fillOval(570, 120, 75, 75);
		g.fillOval(570, 215, 75, 75);
		g.fillOval(570, 310, 75, 75);
		g.fillOval(570, 405, 75, 75);
		g.fillOval(570, 500, 75, 75);
		g.fillOval(570, 595, 75, 75);
		g.fillOval(665, 120, 75, 75);
		g.fillOval(665, 215, 75, 75);
		g.fillOval(665, 310, 75, 75);
		g.fillOval(665, 405, 75, 75);
		g.fillOval(665, 500, 75, 75);
		g.fillOval(665, 595, 75, 75);
		g.fillOval(760, 120, 75, 75);
		g.fillOval(760, 215, 75, 75);
		g.fillOval(760, 310, 75, 75);
		g.fillOval(760, 405, 75, 75);
		g.fillOval(760, 500, 75, 75);
		g.fillOval(760, 595, 75, 75);
		g.fillOval(855, 120, 75, 75);
		g.fillOval(855, 215, 75, 75);
		g.fillOval(855, 310, 75, 75);
		g.fillOval(855, 405, 75, 75);
		g.fillOval(855, 500, 75, 75);
		g.fillOval(855, 595, 75, 75);
		g.fillOval(950, 120, 75, 75);
		g.fillOval(950, 215, 75, 75);
		g.fillOval(950, 310, 75, 75);
		g.fillOval(950, 405, 75, 75);
		g.fillOval(950, 500, 75, 75);
		g.fillOval(950, 595, 75, 75);
		g.fillOval(1045, 120, 75, 75);
		g.fillOval(1045, 215, 75, 75);
		g.fillOval(1045, 310, 75, 75);
		g.fillOval(1045, 405, 75, 75);
		g.fillOval(1045, 500, 75, 75);
		g.fillOval(1045, 595, 75, 75);
		g.fillOval(1140, 120, 75, 75);
		g.fillOval(1140, 215, 75, 75);
		g.fillOval(1140, 310, 75, 75);
		g.fillOval(1140, 405, 75, 75);
		g.fillOval(1140, 500, 75, 75);
		g.fillOval(1140, 595, 75, 75);
	}
	
	public static void plainboard(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1280, 720);
	}
	
	public static String[][] pieces(int intTheme){
		
		boolean blnFileFail = false;
		FileReader themefile = null;
		BufferedReader thefiledata = null;
		String strPiece [][];
		strPiece = new String[3][6];
		
		try{
			themefile = new FileReader("themes.txt");
		}catch(FileNotFoundException e){
			System.out.println("Unable to read from the file...");
			blnFileFail = true;
		}
		if(blnFileFail == false){
			thefiledata = new BufferedReader(themefile);
			String strLine = "";

			try{
				strLine = thefiledata.readLine();
			}catch(IOException e){
				strLine = "";
			}
			
			if(intTheme == 1){
				try{
					strPiece[0][0] = thefiledata.readLine();
					strPiece[0][1] = thefiledata.readLine();
					strPiece[1][2] = thefiledata.readLine();
					strPiece[1][3] = thefiledata.readLine();
					strPiece[2][4] = thefiledata.readLine();
					strPiece[2][5] = thefiledata.readLine();
				}catch(IOException e){
					strPiece[2][5] = "";
				}
			}
					
		}
		return strPiece;
	}
	
}
