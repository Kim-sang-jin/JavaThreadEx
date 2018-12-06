package Java_Thread2;
public class SampleCode2 extends { //Q1 : 뭘 상속한다고요?
	
	public void run() {
		System.out.println(">> 스레드를 무려 2개나 만들어보아요! <<");
	}

	public static void main(String[] args) {
		SampleCode2 th1 = new SampleCode2();
		SampleCode2 th2 = new SampleCode2();
		
		//Q2 : 생성한 두 스레드를 시작시켜보아요		

	}

}
