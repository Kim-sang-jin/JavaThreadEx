package Java_Thread2;
class EvenCounter extends Thread{
	int n = 0;
	public void run() {
		
		while(true) {
			System.out.println(n);
			n += 2;
			
			try {
				Thread.; //Q1 : 스레드를 1초동안 재우는 메소드!
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
class OddCounter extends Thread{
	int  m = 1;
	public void run() {
		
		while(true) {
			System.out.println(m);
			m += 2;
			
			try {
				Thread.; //Q2 : 스레드를 1초동안 재우는 메소드222
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class SampleCode5 {

	public static void main(String[] args) {
		System.out.println(">> 두 스레드 중 하나는 죽습니다 <<");
		System.out.println(">> 눈물 ㅠ.ㅠ   <<");
		
		EvenCounter th1 = new EvenCounter();
		OddCounter th2 = new OddCounter();
		
		long beforetime = System.currentTimeMillis();
		
		th1.start();
		th2.start();
		
		while(true) {
			long aftertime = System.currentTimeMillis();
			
			long difference = aftertime - beforetime;
			
			if(difference/1000 >= 5) {
				 // Q3 : 스레드 th1 의 실행을 중지시키는 메소드
			}
		}
		
	}

}
