package variablesAtomicas;

/**
 * @author Openwebinars
 *
 */

public class TestContadorAtomico {
	
		public static void main(String[] args) {
			
			ContadorAtomico contador = new ContadorAtomico();
			
			new Thread(()->{
				contador.incrementar();
				contador.incrementar();
				System.out.println(contador.valor());
			}).start();
			
			new Thread(()->{
				contador.decrementar();
				contador.decrementar();
				System.out.println(contador.valor());
			}).start();

			
		}

	}