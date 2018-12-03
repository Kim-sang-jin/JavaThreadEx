package JavaThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable{
   private Thread th; // 진동하는 스레드
   public VibratingFrame() {
      setTitle("진동하는 프레임 만들기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(200,200);
      setLocation(300,300);// 프레임의 위치를 screen의 (300,300)에 설정
      setVisible(true);
      
      getContentPane().addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            if(!th.isAlive())return; //이미 스레드가 종료했다면 그냥 리턴
            th.interrupt();// 진동 스레드에게 InterruptedException을 보내 강제 종료
         }
      });
      
      th=new Thread(this); // 진동 스레드 객체 생성
      th.start(); // 진동 시작

   }
   
   @Override
   public void run() { // 프레임의 진동을 일으키기 위해 20ms마다 프레임의 위치를 랜덤하게 이동
      
      Random r = new Random(); // 진동할 위치를 랜덤하게 발생시킬 랜덤 객체 생성
      while(true) {
         try {
            Thread.sleep(20); // 20ms 잠자기
         }
         catch(InterruptedException e) {
            return; // 리턴하면 스레드 종료
         }
         int x= getX()+ r.nextInt()%5; //새 위치 x
         int y= getY()+ r.nextInt()%5; //새 위치 y
         setLocation(x,y); // 프레임의 위치 이동, 진동 효과
            
         }
      }
      
      public static void main(String[]args) {
         new VibratingFrame();
      
   }
}
