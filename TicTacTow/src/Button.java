import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{

	//The two options asside from empty
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
		case 0: //starts at 0
			Victory.checkWin(); //inbetween state - checks if someone has won
			TicTacToe.turn ++;
			break;
		case 1: //turn is 1
			setIcon(X);
			TicTacToe.turn ++;
			break;
		case 2: //turn is 2
			Victory.checkWin(); //inbetween state - checks if someone has won
			TicTacToe.turn ++;
			break;
		case 3: //turn is 3 and then reduces back to case 0
			setIcon(O);
			TicTacToe.turn =- 3;
			break;
		}
		
		
	}
}
