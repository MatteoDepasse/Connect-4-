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
	
	public static String P1piece(Graphics g, int intX, String strBoard[][],String strP1, String strP2, String strEmpty, BufferedImage classicred){
	//	BufferedImage classicred;
		BufferedImage classicyellow;
		BufferedImage industrialscrew;
		BufferedImage industrialnut;
		BufferedImage spacemoon;
		BufferedImage spacestar;
		
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
		
		if(intX >= 560 && intX < 650 && strBoard[0][0].equals(strEmpty)){
			strBoard[0][0] = strP1;
			g.drawImage(classicred, 570, 595, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][1].equals(strEmpty)){
			strBoard[0][1] = strP1;
			g.drawImage(classicred, 570, 500, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][2].equals(strEmpty)){
			strBoard[0][2] = strP1;
			g.drawImage(classicred, 570, 405, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][3].equals(strEmpty)){
			strBoard[0][3] = strP1;
			g.drawImage(classicred, 570, 310, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][4].equals(strEmpty)){
			strBoard[0][4] = strP1;
			g.drawImage(classicred, 570, 215, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][5].equals(strEmpty)){
			strBoard[0][5] = strP1;
			g.drawImage(classicred, 570, 120, null);
		}else if(intX >= 560 && intX < 650 && (strBoard[0][5].equals(strP1)||strBoard[0][5].equals(strP2))){
			while(intX >= 560 && intX < 650){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 660 && intX < 740 && strBoard[1][0].equals(strEmpty)){
			strBoard[1][0] = strP1;
			g.drawImage(classicred, 665, 595, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][1].equals(strEmpty)){
			strBoard[1][1] = strP1;
			g.drawImage(classicred, 665, 500, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][2].equals(strEmpty)){
			strBoard[1][2] = strP1;
			g.drawImage(classicred, 665, 405, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][3].equals(strEmpty)){
			strBoard[1][3] = strP1;
			g.drawImage(classicred, 665, 310, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][4].equals(strEmpty)){
			strBoard[1][4] = strP1;
			g.drawImage(classicred, 665, 215, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][5].equals(strEmpty)){
			strBoard[1][5] = strP1;
			g.drawImage(classicred, 665, 120, null);
		}else if(intX > 660 && intX < 740 && (strBoard[1][5].equals(strP1)||strBoard[1][5].equals(strP2))){
			while(intX > 660 && intX < 740){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 750 && intX < 840 && strBoard[2][0].equals(strEmpty)){
			strBoard[2][0] = strP1;
			g.drawImage(classicred, 760, 595, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][1].equals(strEmpty)){
			strBoard[2][1] = strP1;
			g.drawImage(classicred, 760, 500, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][2].equals(strEmpty)){
			strBoard[2][2] = strP1;
			g.drawImage(classicred, 760, 405, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][3].equals(strEmpty)){
			strBoard[2][3] = strP1;
			g.drawImage(classicred, 760, 310, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][4].equals(strEmpty)){
			strBoard[2][4] = strP1;
			g.drawImage(classicred, 760, 215, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][5].equals(strEmpty)){
			strBoard[2][5] = strP1;
			g.drawImage(classicred, 760, 120, null);
		}else if(intX > 750 && intX < 840 && (strBoard[2][5].equals(strP1)||strBoard[2][5].equals(strP2))){
			while(intX > 750 && intX < 840){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 850 && intX < 930 && strBoard[3][0].equals(strEmpty)){
			strBoard[3][0] = strP1;
			g.drawImage(classicred, 855, 595, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][1].equals(strEmpty)){
			strBoard[3][1] = strP1;
			g.drawImage(classicred, 855, 500, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][2].equals(strEmpty)){
			strBoard[3][2] = strP1;
			g.drawImage(classicred, 855, 405, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][3].equals(strEmpty)){
			strBoard[3][3] = strP1;
			g.drawImage(classicred, 855, 310, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][4].equals(strEmpty)){
			strBoard[3][4] = strP1;
			g.drawImage(classicred, 855, 215, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][5].equals(strEmpty)){
			strBoard[3][5] = strP1;
			g.drawImage(classicred, 855, 120, null);
		}else if(intX > 850 && intX < 930 && (strBoard[3][5].equals(strP1)||strBoard[3][5].equals(strP2))){
			while(intX > 850 && intX < 930){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 940 && intX < 1030 && strBoard[4][0].equals(strEmpty)){
			strBoard[4][0] = strP1;
			g.drawImage(classicred, 950, 595, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][1].equals(strEmpty)){
			strBoard[4][1] = strP1;
			g.drawImage(classicred, 950, 500, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][2].equals(strEmpty)){
			strBoard[4][2] = strP1;
			g.drawImage(classicred, 950, 405, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][3].equals(strEmpty)){
			strBoard[4][3] = strP1;
			g.drawImage(classicred, 950, 310, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][4].equals(strEmpty)){
			strBoard[4][4] = strP1;
			g.drawImage(classicred, 950, 215, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][5].equals(strEmpty)){
			strBoard[4][5] = strP1;
			g.drawImage(classicred, 950, 120, null);
		}else if(intX > 940 && intX < 1030 && (strBoard[4][5].equals(strP1)||strBoard[4][5].equals(strP2))){
			while(intX > 940 && intX < 1030){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 1040 && intX < 1130 && strBoard[5][0].equals(strEmpty)){
			strBoard[5][0] = strP1;
			g.drawImage(classicred, 1045, 595, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][1].equals(strEmpty)){
			strBoard[5][1] = strP1;
			g.drawImage(classicred, 1045, 500, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][2].equals(strEmpty)){
			strBoard[5][2] = strP1;
			g.drawImage(classicred, 1045, 405, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][3].equals(strEmpty)){
			strBoard[5][3] = strP1;
			g.drawImage(classicred, 1045, 310, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][4].equals(strEmpty)){
			strBoard[5][4] = strP1;
			g.drawImage(classicred, 1045, 215, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][5].equals(strEmpty)){
			strBoard[5][5] = strP1;
			g.drawImage(classicred, 1045, 120, null);
		}else if(intX > 1040 && intX < 1130 && (strBoard[5][5].equals(strP1)||strBoard[5][5].equals(strP2))){
			while(intX > 1040 && intX < 1130){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 1140 && intX < 1220 && strBoard[6][0].equals(strEmpty)){
			strBoard[6][0] = strP1;
			g.drawImage(classicred, 1140, 595, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][1].equals(strEmpty)){
			strBoard[6][1] = strP1;
			g.drawImage(classicred, 1140, 500, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][2].equals(strEmpty)){
			strBoard[6][2] = strP1;
			g.drawImage(classicred, 1140, 405, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][3].equals(strEmpty)){
			strBoard[6][3] = strP1;
			g.drawImage(classicred, 1140, 310, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][4].equals(strEmpty)){
			strBoard[6][4] = strP1;
			g.drawImage(classicred, 1140, 215, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][5].equals(strEmpty)){
			strBoard[6][5] = strP1;
			g.drawImage(classicred, 1140, 120, null);
		}else if(intX > 1140 && intX < 1220 && (strBoard[6][5].equals(strP1)||strBoard[6][5].equals(strP2))){
			while(intX > 1140 && intX < 1220){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		return strP1;
	}
	
	public static String P2piece(Graphics g, int intX, String strBoard[][],String strP1, String strP2, String strEmpty, BufferedImage classicyellow){
		BufferedImage classicred;
	//	BufferedImage classicyellow;
		BufferedImage industrialscrew;
		BufferedImage industrialnut;
		BufferedImage spacemoon;
		BufferedImage spacestar;
		
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
		
		if(intX >= 560 && intX < 650 && strBoard[0][0].equals(strEmpty)){
			strBoard[0][0] = strP2;
			g.drawImage(classicyellow, 570, 595, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][1].equals(strEmpty)){
			strBoard[0][1] = strP2;
			g.drawImage(classicyellow, 570, 500, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][2].equals(strEmpty)){
			strBoard[0][2] = strP2;
			g.drawImage(classicyellow, 570, 405, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][3].equals(strEmpty)){
			strBoard[0][3] = strP2;
			g.drawImage(classicyellow, 570, 310, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][4].equals(strEmpty)){
			strBoard[0][4] = strP2;
			g.drawImage(classicyellow, 570, 215, null);
		}else if(intX >= 560 && intX < 650 && strBoard[0][5].equals(strEmpty)){
			strBoard[0][5] = strP2;
			g.drawImage(classicyellow, 570, 120, null);
		}else if(intX >= 560 && intX < 650 && (strBoard[0][5].equals(strP2)||strBoard[0][5].equals(strP1))){
			while(intX >= 560 && intX < 650){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 660 && intX < 740 && strBoard[1][0].equals(strEmpty)){
			strBoard[1][0] = strP2;
			g.drawImage(classicyellow, 665, 595, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][1].equals(strEmpty)){
			strBoard[1][1] = strP2;
			g.drawImage(classicyellow, 665, 500, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][2].equals(strEmpty)){
			strBoard[1][2] = strP2;
			g.drawImage(classicyellow, 665, 405, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][3].equals(strEmpty)){
			strBoard[1][3] = strP2;
			g.drawImage(classicyellow, 665, 310, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][4].equals(strEmpty)){
			strBoard[1][4] = strP2;
			g.drawImage(classicyellow, 665, 215, null);
		}else if(intX > 660 && intX < 740 && strBoard[1][5].equals(strEmpty)){
			strBoard[1][5] = strP2;
			g.drawImage(classicyellow, 665, 120, null);
		}else if(intX > 660 && intX < 740 && (strBoard[1][5].equals(strP2)||strBoard[1][5].equals(strP1))){
			while(intX > 660 && intX < 740){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 750 && intX < 840 && strBoard[2][0].equals(strEmpty)){
			strBoard[2][0] = strP2;
			g.drawImage(classicyellow, 760, 595, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][1].equals(strEmpty)){
			strBoard[2][1] = strP2;
			g.drawImage(classicyellow, 760, 500, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][2].equals(strEmpty)){
			strBoard[2][2] = strP2;
			g.drawImage(classicyellow, 760, 405, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][3].equals(strEmpty)){
			strBoard[2][3] = strP2;
			g.drawImage(classicyellow, 760, 310, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][4].equals(strEmpty)){
			strBoard[2][4] = strP2;
			g.drawImage(classicyellow, 760, 215, null);
		}else if(intX > 750 && intX < 840 && strBoard[2][5].equals(strEmpty)){
			strBoard[2][5] = strP2;
			g.drawImage(classicyellow, 760, 120, null);
		}else if(intX > 750 && intX < 840 && (strBoard[2][5].equals(strP2)||strBoard[2][5].equals(strP1))){
			while(intX > 750 && intX < 840){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 850 && intX < 930 && strBoard[3][0].equals(strEmpty)){
			strBoard[3][0] = strP2;
			g.drawImage(classicyellow, 855, 595, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][1].equals(strEmpty)){
			strBoard[3][1] = strP2;
			g.drawImage(classicyellow, 855, 500, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][2].equals(strEmpty)){
			strBoard[3][2] = strP2;
			g.drawImage(classicyellow, 855, 405, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][3].equals(strEmpty)){
			strBoard[3][3] = strP2;
			g.drawImage(classicyellow, 855, 310, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][4].equals(strEmpty)){
			strBoard[3][4] = strP2;
			g.drawImage(classicyellow, 855, 215, null);
		}else if(intX > 850 && intX < 930 && strBoard[3][5].equals(strEmpty)){
			strBoard[3][5] = strP2;
			g.drawImage(classicyellow, 855, 120, null);
		}else if(intX > 850 && intX < 930 && (strBoard[3][5].equals(strP2)||strBoard[3][5].equals(strP1))){
			while(intX > 850 && intX < 930){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 940 && intX < 1030 && strBoard[4][0].equals(strEmpty)){
			strBoard[4][0] = strP2;
			g.drawImage(classicyellow, 950, 595, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][1].equals(strEmpty)){
			strBoard[4][1] = strP2;
			g.drawImage(classicyellow, 950, 500, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][2].equals(strEmpty)){
			strBoard[4][2] = strP2;
			g.drawImage(classicyellow, 950, 405, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][3].equals(strEmpty)){
			strBoard[4][3] = strP2;
			g.drawImage(classicyellow, 950, 310, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][4].equals(strEmpty)){
			strBoard[4][4] = strP2;
			g.drawImage(classicyellow, 950, 215, null);
		}else if(intX > 940 && intX < 1030 && strBoard[4][5].equals(strEmpty)){
			strBoard[4][5] = strP2;
			g.drawImage(classicyellow, 950, 120, null);
		}else if(intX > 940 && intX < 1030 && (strBoard[4][5].equals(strP2)||strBoard[4][5].equals(strP1))){
			while(intX > 940 && intX < 1030){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 1040 && intX < 1130 && strBoard[5][0].equals(strEmpty)){
			strBoard[5][0] = strP2;
			g.drawImage(classicyellow, 1045, 595, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][1].equals(strEmpty)){
			strBoard[5][1] = strP2;
			g.drawImage(classicyellow, 1045, 500, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][2].equals(strEmpty)){
			strBoard[5][2] = strP2;
			g.drawImage(classicyellow, 1045, 405, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][3].equals(strEmpty)){
			strBoard[5][3] = strP2;
			g.drawImage(classicyellow, 1045, 310, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][4].equals(strEmpty)){
			strBoard[5][4] = strP2;
			g.drawImage(classicyellow, 1045, 215, null);
		}else if(intX > 1040 && intX < 1130 && strBoard[5][5].equals(strEmpty)){
			strBoard[5][5] = strP2;
			g.drawImage(classicyellow, 1045, 120, null);
		}else if(intX > 1040 && intX < 1130 && (strBoard[5][5].equals(strP2)||strBoard[5][5].equals(strP1))){
			while(intX > 1040 && intX < 1130){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		if(intX > 1140 && intX < 1220 && strBoard[6][0].equals(strEmpty)){
			strBoard[6][0] = strP2;
			g.drawImage(classicyellow, 1140, 595, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][1].equals(strEmpty)){
			strBoard[6][1] = strP2;
			g.drawImage(classicyellow, 1140, 500, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][2].equals(strEmpty)){
			strBoard[6][2] = strP2;
			g.drawImage(classicyellow, 1140, 405, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][3].equals(strEmpty)){
			strBoard[6][3] = strP2;
			g.drawImage(classicyellow, 1140, 310, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][4].equals(strEmpty)){
			strBoard[6][4] = strP2;
			g.drawImage(classicyellow, 1140, 215, null);
		}else if(intX > 1140 && intX < 1220 && strBoard[6][5].equals(strEmpty)){
			strBoard[6][5] = strP2;
			g.drawImage(classicyellow, 1140, 120, null);
		}else if(intX > 1140 && intX < 1220 && (strBoard[6][5].equals(strP2)||strBoard[6][5].equals(strP1))){
			while(intX > 1140 && intX < 1220){
				g.setColor(Color.BLACK);
				g.drawString("Column Full!", 350, 600);
			}
		}
		return strP2;
	}
}
