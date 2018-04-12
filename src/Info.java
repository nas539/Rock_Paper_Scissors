import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Info extends JPanel {
	int height, x, y;
	String howToPlay=new String("Make a selection:\n Rock:1\n Paper:2\n Scissors:3");
	Font scriptBold=new Font("Freesytle Script", Font.BOLD, 24);
	Color color=new Color(100, 0, 100);
	
	public String Info(){
		return howToPlay;
	}
	
	@Override
	public  void paintComponent(Graphics g){
		super.paintComponent(g);
		int x=20;
		int y=30;
		g.setFont(scriptBold);
		g.setColor(color);
		displayMetrics(g);
	}
		
	public void displayMetrics(Graphics g){
		g.drawString(howToPlay, x, y+=height);
		
	}
	
}