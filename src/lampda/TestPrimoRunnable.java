package lampda;

public class TestPrimoRunnable {

		public static void main(String[] args) {
			
			//Creaci�n y lanzamiento de PrimoRunnable
			//a trav�s de un thread.
			Thread t = new Thread(new PrimoRunnable(1234567));
			t.start();
			
			//Otra forma de hacerlo, a trav�s de una 
			//instancia an�nima
			new Thread(new PrimoRunnable(23456789)).start();
			new Thread(new PrimoRunnable(34567891)).start();
		}
	}