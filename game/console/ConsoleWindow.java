package game.console;

import game.Game;
import game.console.command.Command;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConsoleWindow extends JFrame implements KeyListener{

	private JScrollPane cScroll;
	private JTextArea console;
	private JTextField cmdbar;
	private JButton cmdSubmit;
	
	private ArrayList<Command>commandRegistry = new ArrayList<Command>();
	
	
	public ConsoleWindow()
	{
		this.addKeyListener(this);
		this.setTitle(Game.TITLE+" console.");
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(Game.WIDTH, Game.HEIGHT);

		
		console = new JTextArea();
		console.setEditable(false);
		console.setRows(10);
		console.setColumns(10);
		
		cScroll = new JScrollPane();
		cScroll.getViewport().add(console);
		
		cmdbar = new JTextField();
		
		cmdSubmit = new JButton("Enter");
		
		add(cScroll);
		add(cmdbar, BorderLayout.PAGE_END);
		//add(cmdSubmit);
		validate();
		
	}
	
	public void log(String s)
	{
		console.setText(console.getText()+"\n"+s);
	}
	
	public void command(String[] cmd)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER && cmdbar.getText() != null)
		{
			command(cmdbar.getText().split(" "));
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}