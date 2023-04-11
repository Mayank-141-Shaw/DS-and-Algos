package recursion;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeGame extends JPanel implements ActionListener, KeyListener{
	
	public static final int HEIGHT = 500;
	public static final int WIDTH = 500;
	
	private boolean running;
	private ArrayList<Point> snakeBody;
	private Point fruit;
	private int snakeSize;
	private int moves;
	private Timer timer;
	private Random rand;
	
	public SnakeGame() {
		initGame();
	}
	
	public void initGame() {
		timer = new Timer(60, this);
		timer.start();
		rand = new Random();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
