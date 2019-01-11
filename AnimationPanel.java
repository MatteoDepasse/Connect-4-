import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel extends JPanel{

	// Properties
	BufferedImage imglogo;

	// Methods
	public void paintComponent(Graphics g){
		tools.plainboard(g);
		g.drawImage(imglogo, 300, 50, null);
	}
	
	// Constructor
	public AnimationPanel(){
		super();
		try{
			imglogo = ImageIO.read(new File("Logo.png"));
		}catch(IOException e){
			System.out.println("Unable to load");
		}
	}
}
	
	
