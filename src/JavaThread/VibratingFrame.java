package JavaThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable{
   private Thread th; 
   public VibratingFrame() {
      setTitle("진동하는 프레임 만들기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(200,200);
      setLocation(300,300);
      setVisible(true);
      
      getContentPane().addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            if(!th.isAlive())return; 
            //Q1: 진동 스레드 강제 종료
         }
      });
      
      //Q2: start 함수 호출 준비
      th.start(); 

   }
   
   @Override
   public void run() { 
      
      Random r = new Random(); 
      while(true) {
         //Q3: 예외처리
         int x= getX()+ r.nextInt()%5; 
         int y= getY()+ r.nextInt()%5; 
         setLocation(x,y); 
            
         }
      }
      
      public static void main(String[]args) {
         new VibratingFrame();
      
   }
}
