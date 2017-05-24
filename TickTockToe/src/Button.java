import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//The two options aside from empty
	ImageIcon  X,O;
	public String x = "X";
	public String o = "O";


	public Button()
	{
		X = new ImageIcon(this.getClass().getResource("x.jpg"));
		O = new ImageIcon(this.getClass().getResource("o.jpg"));
		this.addActionListener(this);

		
	}
	public void actionPerformed(ActionEvent event)
	{	
		  

		switch(TicTacToe.turn)
		{
		case 0: //turn is 0
			setIcon(X);
			setText(x);
			System.out.println("printing X");
			TicTacToe.turn++;
			System.out.println("switching turn");
			
		
			
			removeActionListener(this);
			Victory vic = new Victory();
			vic.checkWin();
			break;

		case 1: //turn is 1 and then reduces back to case 0
			setIcon(O);
			setText(o);
			System.out.println("printing O");
			TicTacToe.turn--;
			System.out.println("switching turn");
			
	
			removeActionListener(this);
			break;
		}
		
		
	}
}
