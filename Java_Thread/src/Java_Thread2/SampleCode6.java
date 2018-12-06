package Java_Thread2;
class Calculate{
	int sum = 0;
	
	 void add() { //Q1 : add() 메소드를 동기화시키고 싶은데 어떡하죠?
		int n = sum;
		
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}
class Worker extends Thread{
	Calculate cl;
	
	public Worker(String name, Calculate cl) {
		super(name);
		this.cl = cl;
	}
	
	public void  { //Q2 : 여기에 뭐가 들어갈까요? thread 상속받은 클래스니까 뭐?
		for(int i = 0; i<10; i++) {
			cl.add();
		}
	}
}
public class SampleCode6 {
	static Calculate cl = new Calculate();

	public static void main(String[] args) {
		System.out.println(">> 정보 : 동기화는 중요하다 <<");
		System.out.println(">> 팩트 : 동기화는 중요하다22 <<");
		Worker th1 = new Worker("A", cl);
		Worker th2 = new Worker("B", cl);
		
		//Q3 : 생성된 스레드가 일할 수 있게 해주세오

	}

}
