package coleccionConcurrente;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Openwebinars
 *
 */
public class Test {

	public static void main(String[] args) {

		// Colección compartida
		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(20);

		/*
		 *  Productores y consumidores
		 *  Tipos de pool de hilos:
		 *  -> Single: Con un solo hilo de ejecución disponible.
		 *  Si le pedimos (submit) mas de una tarea a la vez, 
		 *  las pone en cola.
		 *  -> Fixed: Indicamos, en el momento de su creación,
		 *  el número de hilos. Si dispone de n hilos, y enviamos n+1
		 *  tareas, las pone en cola.
		 *  -> Cached: Crea hilos conforme enviamos tareas
		 *  Reutiliza los hilos cuyas tareas han finalizado, 
		 *  para ejecutar tareas nuevas.  
		 */
		
		ExecutorService executor = Executors.newCachedThreadPool();

		executor.submit(new Producer(q));
		executor.submit(new Producer(q));
		executor.submit(new Consumer(q));

	}

}
