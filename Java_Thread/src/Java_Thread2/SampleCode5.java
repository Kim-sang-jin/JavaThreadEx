package Java_Thread2;
class EvenCounter extends Thread{
	int n = 0;
	public void run() {
		
		while(true) {
			System.out.println(n);
			n += 2;
			
			try {
				Thread.; //Q1 : �����带 1�ʵ��� ���� �޼ҵ�!
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
				Thread.; //Q2 : �����带 1�ʵ��� ���� �޼ҵ�222
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class SampleCode5 {

	public static void main(String[] args) {
		System.out.println(">> �� ������ �� �ϳ��� �׽��ϴ� <<");
		System.out.println(">> ���� ��.��   <<");
		
		EvenCounter th1 = new EvenCounter();
		OddCounter th2 = new OddCounter();
		
		long beforetime = System.currentTimeMillis();
		
		th1.start();
		th2.start();
		
		while(true) {
			long aftertime = System.currentTimeMillis();
			
			long difference = aftertime - beforetime;
			
			if(difference/1000 >= 5) {
				 // Q3 : ������ th1 �� ������ ������Ű�� �޼ҵ�
			}
		}
		
	}

}
