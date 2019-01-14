import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;



public class HighScore{

	

	public static void HighScore(String strN){
		
		String strArray [][];
		int intCount; 
		int intLines; 
		intLines = 0; 
		
		boolean blnFileFail = false;
		FileReader thefile = null;
		BufferedReader thefiledata = null;
		
		try{
			thefile = new FileReader("score.txt");
		}catch(FileNotFoundException e){
			System.out.println("unable to read from the file ... dont do anything");
			blnFileFail = true;
		}
		if(blnFileFail == false){
			thefiledata = new BufferedReader(thefile); 
			String strLine = "";
			try{
				strLine = thefiledata.readLine();
			}catch(IOException e){
				strLine = "EMPTY";
			}
			while(strLine != null){
				System.out.println(strLine); 
				intLines = intLines + 1; 
				strArray = new String[1][9]; 
				for(intCount = 0 ;intCount < intLines; intCount++){
				strArray[intCount][0] = strLine;
				System.out.println(strArray[intCount][0]);
				}
				try{
					strLine = thefiledata.readLine();
				}catch(IOException e){
					strLine = "EMPTY";
				}
			}
		}
	}
} 

