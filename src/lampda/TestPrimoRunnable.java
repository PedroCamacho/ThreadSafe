package lampda;

public class TestPrimoRunnable {

		public static void main(String[] args) {
			
			//Creación y lanzamiento de PrimoRunnable
			//a través de un thread.
			Thread t = new Thread(new PrimoRunnable(1234567));
			t.start();
			
			//Otra forma de hacerlo, a través de una 
			//instancia anónima
			new Thread(new PrimoRunnable(23456789)).start();
			new Thread(new PrimoRunnable(34567891)).start();
		}
	}