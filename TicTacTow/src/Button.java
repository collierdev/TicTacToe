import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{

	//The two options aside from empty
	ImageIcon  X,O;

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
			TicTacToe.turn++;
			//Victory.checkWin(); //inbetween state - checks if someone has won
			removeActionListener(this);
			break;

		case 1: //turn is 1 and then reduces back to case 0
			setIcon(O);
			TicTacToe.turn--;
			removeActionListener(this);
			break;
		}
		
		
	}
}
