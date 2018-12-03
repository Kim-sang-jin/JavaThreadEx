package JavaThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel{
	private int barSize = 0;
	private int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(getWidth()))/maxBarSize*barSize);
		if(width == 0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		//Q1: 바의 길이를 늘려 다시 그리고, 크기가 최대이면 대기
	}
	synchronized void consume() {
		//Q2: 바의 길이를 줄여 다시 그리고, 크기가 0이면 대기
	}
}
class ConsumerThread extends Thread{
	private MyLabel bar;
	
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	public void run() { 
		while(true) {
			try {
				sleep(100);
				bar.consume();
			}catch(InterruptedException e) {return;}
			
		}
	}
}
public class TabAndThreadEx extends JFrame {
	private MyLabel bar = new MyLabel(100);
	
	public TabAndThreadEx(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill();	
			}
		});
		
		setSize(350, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		//Q3: 스레드 실행 시 필수!!
	}

	public static void main(String[] args) {
		new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");
	}
}
