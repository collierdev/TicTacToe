import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;

public class TicTacToe extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	
	//turn counter called in the button to switch between x and o
	public static int turn = 0;
	
	//the brackets are creating an array
	//we need nine buttons so a total of 9 slots for buttons in the array
	Button[] button = new Button[9];
	
	public static void main(String[] args) {
		new TicTacToe();
		
	}
	
	public TicTacToe()
	{
		//making it so each square is 600x600
		//can be resized, maybe change that?
		//make the program stop when closed
		
		setSize(800,800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//making a 3x3 grid within the panel in a grid layout
		panel.setLayout(new GridLayout(3,3) );

		//creating 9 buttons within the button array
		for(int i = 0; i < 9; i++)
		{
			//creates button
			button[i] = new Button();
			//adds button to the panel
			panel.add(button[i]);
		}
		
		add(panel);

		setVisible(true);
		
		//popout window
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "X wins!");
		

	
		/* maybe buttons should be numbered? or rows and columns? 
		 *Columns: 1  2  3
		 *Row 1:  [0][1][2]
		 *Row 2:  [3][4][5]
		 *Row 3:  [6][7][8] 
		 *
		 *That way checking for victory conditions will be easy.. or even possible.
	*/
	}
}

