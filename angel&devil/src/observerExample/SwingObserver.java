package observerExample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserver {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserver example = new SwingObserver();
		example.go();

	}
	
	public void go() {
		
		
		frame = new JFrame("Devil vs Angel");
		JButton button = new JButton("Should I do it");
		Font fuente=new Font("Monospaced", Font.BOLD, 36);
		button.setFont(fuente);
		
		button.setForeground(Color.BLUE);
		button.setBackground(Color.YELLOW);
	
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set frame properties here
		//frame.setSize(250, 150);
		frame.setBounds(1000, 250, 500, 300);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don’t do it");
		}
	}
	
	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Do it");
		}
	}
}
