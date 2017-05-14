import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{

	//The two options asside from empty
	ImageIcon  X,O;
	
	
	int turn = 0;
	public Button()
	{
		X = new ImageIcon(this.getClass().getResource("x.jpg"));
		O = new ImageIcon(this.getClass().getResource("o.jpg"));
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		switch(turn)
		{
		case 0:
			setIcon(X);
			break;
		case 1:
			setIcon(O);
			break;
		}
		turn ++;
		turn %=2;
		
	}
}
