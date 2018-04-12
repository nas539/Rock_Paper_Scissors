import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Random; 
public class RPS {

	public static void main(String[] args) {
	JFrame frame=new JFrame("Game Time!");
	Font font=new Font("Freestyle Script", Font.BOLD, 48);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000, 1000);
	frame.setVisible(true);
	JLabel welcome=new JLabel("Welcome to Rock, Paper, Scissors!\n");
	JLabel info=new JLabel("To play select from the following\n Rock:1\n Paper:2\n Scissors:3");
	welcome.setFont(font);
	info.setFont(font);
	frame.setLayout(new FlowLayout());
	frame.add(welcome);
	frame.add(info);
	}
	

}
