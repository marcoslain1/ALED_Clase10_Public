package executors;

public class Calculadora {

	public static void main(String[] args) throws InterruptedException {
		HebraCalculo a = new HebraCalculo(4, 5);
		HebraCalculo c = new HebraCalculo(5, 7);
		
		a.start();
		c.start();
		
		a.join();
		c.join();
		
		System.out.println(a.getRes() + c.getRes());
	}
}
