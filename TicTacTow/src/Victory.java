import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Victory extends TicTacToe {
	
	 /*Row 1:  [0][1][2]
	  *Row 2:  [3][4][5]
	  *Row 3:  [6][7][8]*/
	
	JFrame frame = new JFrame();

	
	public boolean gameWon = false;
	public int o = 0;
	public int x = 1;
	
	private void checkWin(int number)
	{
		
		if (button[0] == button[1] 
				&& button[1] == button[2]) //top row [x][x][x]
		{
			gameWon = true;
			
			/*if(button[0] == o)
			{*/
				//JOptionPane.showMessageDialog(frame, "O wins!");
			/*}
			if(button[0] == x)
			{
				JOptionPane.showMessageDialog(frame, button[1] + " wins!");;
			}
			*/
		
		}
		if (button[3] == button[4] 
				&& button[4] == button[5]) //mid row [x][x][x]
		{
			gameWon = true;
	
		}
		if (button[6] == button[7] 
				&& button[7] == button[8]) //bot row [x][x][x]
		{
			gameWon = true;
			
		}
		if (button[0] == button[3] 
				&& button[3] == button[6]) //first column [x][x][x]
		{
			gameWon = true;
			
		}
		if (button[1] == button[4] 
				&& button[4] == button[7]) //second column [x][x][x]
		{
			gameWon = true;
			
		}
		if (button[2] == button[5] 
				&& button[5] == button[8]) //last column [x][x][x]
		{
			gameWon = true;
			
		}
		if (button[0] == button[4] 
				&& button[4] == button[8]) //diag 1 [x][x][x]
		{
			gameWon = true;
			
		}
		if (button[2] == button[4] 
				&& button[4] == button[6]) //diag 2 [x][x][x]
		{
			gameWon = true;
			
		}
		
	}
}
