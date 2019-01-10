import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel2 extends JPanel{

	// Properties
	BufferedImage imgwinup;
	BufferedImage imgwinright;
	BufferedImage imgwindiag;
	BufferedImage imgwindiag2;
	
	// Methods
	public void paintComponent(Graphics g){
		
		g.drawImage(imgwinup, 100, 400, null);
		g.drawImage(imgwinright, 400, 400, null);
		g.drawImage(imgwindiag, 700, 400, null);
		g.drawImage(imgwindiag2, 1000, 400, null);
		
	}
	
	// Constructor
	public AnimationPanel2(){
		super();
		try{
			imgwinup = ImageIO.read(new File("winup.png"));
			imgwinright = ImageIO.read(new File("winright.png"));
			imgwindiag = ImageIO.read(new File("windiag.png"));
			imgwindiag2 = ImageIO.read(new File("windiag2.png"));
		}catch(IOException e){
			System.out.println("Unable to load");
		}
	}
}
	
