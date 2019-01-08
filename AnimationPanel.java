import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel extends JPanel{

	// Properties
	boolean blnClear = false;
	
	// Methods
	
	public void paintComponent(Graphics g){
		tools.board(g);
		if(blnClear){
		removeAll();
		//or remove(JComponent)
		revalidate();
		repaint();
	}
	}
	
	// Constructor
	public AnimationPanel(){
		super();
	}
}
	
	
