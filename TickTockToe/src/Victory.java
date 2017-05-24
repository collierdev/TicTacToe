import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Victory extends TicTacToe {
	
	 /*Row 1:  [0][1][2]
	  *Row 2:  [3][4][5]
	  *Row 3:  [6][7][8]*/
	
	//JFrame frame = new JFrame();

	
	public static boolean gameWon = false;
	
	public void checkWin()
	{
		
	/*	if (button[0].getText() == button[1].getText() 
				&& button[1] == button[2] && button[0].getText() != "") //top row [x][x][x]
		{
			System.out.println("Victory condition met: top row");
			gameWon = true;
			Win();
	
		}
		else if (button[3].getText() == button[4].getText() 
				&& button[4].getText() == button[5].getText() && button[3].getText() != "") //mid row [x][x][x]
		{
			System.out.println("Victory condition met: mid row");
			gameWon = true;
			Win();
		}
		else if (button[6].getText() == button[7].getText() 
				&& button[7].getText() == button[8].getText() && button[6].getText() != "") //bot row [x][x][x]
		{
			System.out.println("Victory condition met: bot row");
			gameWon = true;
			Win();
		}
		else if (button[0].getText() == button[3].getText() 
				&& button[3].getText() == button[6].getText() && button[0].getText() != "") //first column [x][x][x]
		{
			System.out.println("Victory condition met: first col");
			gameWon = true;
			Win();
		}
		else if (button[1].getText() == button[4].getText() 
				&& button[4].getText() == button[7].getText() && button[1].getText() != "") //second column [x][x][x]
		{
			System.out.println("Victory condition met: second col");
			gameWon = true;
			Win();
		}
		else if (button[2].getText() == button[5].getText() 
				&& button[5].getText() == button[8].getText() && button[2].getText() != "") //last column [x][x][x]
		{
			System.out.println("Victory condition met: last col");
			gameWon = true;
			Win();
		}
		else if (button[0].getText() == button[4].getText() 
				&& button[4].getText() == button[8].getText() && button[0].getText() != "") //diag 1 [x][x][x]
		{
			System.out.println("Victory condition met: diag 1");
			gameWon = true;
			Win();
		}
		else if (button[2].getText() == button[4].getText() 
				&& button[4].getText() == button[6].getText() && button[2].getText() != "") //diag 2 [x][x][x]
		{
			System.out.println("Victory condition met: diag 2");
			gameWon = true;
			Win();
		}
		else 
        { 
			System.out.println("Victory conditions not met");
            gameWon = false; 
            Win();
        } 
		
		*/
		    }

	
	


private void Win()
		    {
	
	System.out.println("Win Called");
	
		if(button[0].getText() == "O")
		{
			JOptionPane.showMessageDialog(frame, "O wins!");
			System.out.println("O wins");
		}
		if(button[0].getText() == "X")
		{
			JOptionPane.showMessageDialog(frame, button[0].getText() + " wins!");
			System.out.println("X wins");
		}
		else if (turn == 9 && gameWon == false) 
        { 
            JOptionPane.showMessageDialog(null, "Tie!"); 
            System.out.println("Tie");


        } 

		    }
}
