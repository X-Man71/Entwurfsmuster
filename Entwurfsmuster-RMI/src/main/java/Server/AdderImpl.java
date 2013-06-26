package Server;

import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AdderImpl implements Adder
{
	private JFrame jframe;
	private JTextArea jtextarea;
	
	public AdderImpl()
	{
		jframe = new JFrame();
		jtextarea = new JTextArea(10,50);
		jframe.add(jtextarea);
		jframe.pack();
		jframe.setVisible(true);
	}

	@Override
	public String add(String eingabe) throws RemoteException
	{
		jtextarea.append(eingabe);
		return eingabe;
	}

}
