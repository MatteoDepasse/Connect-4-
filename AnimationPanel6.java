import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel6 extends JPanel{

	// Properties
	
	
	// Methods
	public void paintComponent(Graphics g){
		tools.plainboard(g);
		revalidate(); 
	}
	
	// Constructor
	public AnimationPanel6(){
		super();
	}
}
	
