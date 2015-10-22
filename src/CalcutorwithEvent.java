import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcutorwithEvent extends JFrame implements ActionListener{
		
	JButton[] jbt = new JButton[12];
	JTextField jtf = new JTextField("number displayed here");

	public CalcutorwithEvent() {
		
		// Create panel p1 for the buttons and set GridLayout 
		JPanel p1 = new JPanel();
		 p1.setLayout(new GridLayout(4, 3));
		 
		 p1.add(new JButton("+"));
		 p1.add(new JButton("-"));
		 p1.add(new JButton("*"));
		 p1.add(new JButton("/")); 
		// Add buttons to the panel
		for (int i = 1; i <= 9; i++) {
			  jbt[i-1] = new JButton(""+i);
		      p1.add(jbt[i-1]);
			  jbt[i-1].addActionListener(this);
		    }
			JButton jbt0 = new JButton(""+0);
			p1.add(jbt0);
		    
		    p1.add(new JButton("="));

		    // Create panel p2 to hold a text field and p1
		    JPanel p2 = new JPanel(new BorderLayout());
			
		    p2.add(jtf,BorderLayout.NORTH);
		    p2.add(p1, BorderLayout.CENTER);

		    // add contents into the frame
		    add(p2, BorderLayout.CENTER);
		   
	}
	
	public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==jbt[0]){
				jtf.setText("1");
			}
			if(e.getSource()==jbt[1]){
				jtf.setText("2");
			}
			if(e.getSource()==jbt[2]){
				jtf.setText("3");
			}
			if(e.getSource()==jbt[3]){
				jtf.setText("4");
			}
			if(e.getSource()==jbt[4]){
				jtf.setText("5");
			}
			if(e.getSource()==jbt[5]){
				jtf.setText("6");
			}
			if(e.getSource()==jbt[6]){
				jtf.setText("7");
			}
			if(e.getSource()==jbt[7]){
				jtf.setText("8");
			}
			if(e.getSource()==jbt[8]){
				jtf.setText("9");
			}
			
		
	  }
	
	  public static void main(String[] args) {
		CalcutorwithEvent frame = new CalcutorwithEvent();
	    frame.setTitle("The CalculatorWithEvent");
	    frame.setSize(400, 300);
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	  }
	
}
