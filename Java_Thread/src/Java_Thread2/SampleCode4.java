package Java_Thread2;
public class SampleCode4 implements { //Q1 : 어떤 추상 클래스 구현??
	
	public void run() {
		int n = 0;
		System.out.println(">> 당신이 멍때리기 시작한 후로 흐른 시간 <<" );
		while(true) {
			System.out.println(n + "초");
			n++;
			try {
				Thread.; //Q2 : 스레드를 1초동안 재우는 메소드
			}
			catch(InterruptedException e){
				return;
			}
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread(); //Q3 : 생성자 인자로 무엇을 넣을까요?
		th.start();

	}

}
