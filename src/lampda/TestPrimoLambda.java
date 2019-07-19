package lampda;

public class TestPrimoLambda {

	public static void main(String[] args) {
		// Con Runnable anonimo
		// Ctrl-1 para pasarlo a Lambda
		Runnable tarea1 = new Runnable() {
			@Override
			public void run() {
				new PrimoLambda(1234567).ejecuta();
			}
		};
		new Thread(tarea1).start();

		// Con expresion lambda y runnable
		Runnable tarea2 = () -> new PrimoLambda(23456789).ejecuta();
		new Thread(tarea2).start();
		
		//Con expresión lambda sin runnable	
		new Thread(() -> new PrimoLambda(34567891).ejecuta()).start();
	}
}
