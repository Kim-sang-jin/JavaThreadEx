package JavaThread;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
   private JLabel timerLabel;
   
   public TimerThread(JLabel timerLabel) {
      this.timerLabel = timerLabel;
   }
   
   @Override
   public void run() {
      int n=0;
      while(true) {
         timerLabel.setText(Integer.toString(n));
         n++;
         //AfterWork (예외처리)
         }
      }
   }
}

public class ThreadTimerEx extends JFrame{
   public ThreadTimerEx() {
      setTitle("Thread를 상속받은 타이머 스레드 예제");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
      JLabel timerLabel = new JLabel();
      timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
      c.add(timerLabel);
      
      //Q1: 스레드 객체 선언
      
      setSize(250, 150);
      setVisible(true);
      
      //Q2: 스레드 실행 요청
   }

   public static void main(String[] args) {
      new ThreadTimerEx();
   }

}
