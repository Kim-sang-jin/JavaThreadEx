package Java_Thread2;
public class SampleCode4 implements { //Q1 : � �߻� Ŭ���� ����??
	
	public void run() {
		int n = 0;
		System.out.println(">> ����� �۶����� ������ �ķ� �帥 �ð� <<" );
		while(true) {
			System.out.println(n + "��");
			n++;
			try {
				Thread.; //Q2 : �����带 1�ʵ��� ���� �޼ҵ�
			}
			catch(InterruptedException e){
				return;
			}
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread(); //Q3 : ������ ���ڷ� ������ �������?
		th.start();

	}

}
