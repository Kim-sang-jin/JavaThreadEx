package Java_Thread2;
class Calculate{
	int sum = 0;
	
	 void add() { //Q1 : add() �޼ҵ带 ����ȭ��Ű�� ������ �����?
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
	
	public void  { //Q2 : ���⿡ ���� �����? thread ��ӹ��� Ŭ�����ϱ� ��?
		for(int i = 0; i<10; i++) {
			cl.add();
		}
	}
}
public class SampleCode6 {
	static Calculate cl = new Calculate();

	public static void main(String[] args) {
		System.out.println(">> ���� : ����ȭ�� �߿��ϴ� <<");
		System.out.println(">> ��Ʈ : ����ȭ�� �߿��ϴ�22 <<");
		Worker th1 = new Worker("A", cl);
		Worker th2 = new Worker("B", cl);
		
		//Q3 : ������ �����尡 ���� �� �ְ� ���ּ���

	}

}
