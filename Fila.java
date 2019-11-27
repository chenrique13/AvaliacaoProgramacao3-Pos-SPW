
public class Fila {

	private static int dimensaoFila = 0;
	private static int[] fila = new int[dimensaoFila];

	/* Inserir Elemento na Fila */
	public static void inserir(Integer senha) {

		int[] filaAux = new int[fila.length];

		for (int i = 0; i < filaAux.length; i++) {
			filaAux[i] = fila[i];
		}
		dimensaoFila += 1;
		fila = new int[dimensaoFila];
		for (int i = 0; i < filaAux.length; i++) {
			fila[i] = filaAux[i];
		}
		fila[dimensaoFila - 1] = senha;
	}

	/* Remover Elemento na Fila */
	public static void remover() {
		if (dimensaoFila >= 1) {
			int[] filaAux = new int[fila.length];

			for (int i = 0; i < fila.length; i++) {
				filaAux[i] = fila[i];
			}
			dimensaoFila -= 1;
			fila = new int[dimensaoFila];
			for (int i = 1; i < filaAux.length; i++) {
				fila[i - 1] = filaAux[i];
			}
		} else {
			System.out.println("Fila vazia!\n");
		}
	}

	/* Listar Elementos da Fila */
	public static void listar() {
		System.out.println("---------------------");
		System.out.println("Listando senhas...\n");
		for (int i = 0; i < dimensaoFila; i++) {

			if ((fila[i] % 2) == 0) {
				System.out.println("Senha " + fila[i] + " Preferencial");
			} else {
				System.out.println("Senha " + fila[i] + " Normal");
			}
		}
		System.out.println("---------------------");
	}

	/* Ordenar Elementos da Fila */
	public static void insertionSort() {
		for (int i = 0; i < getFila().length; i++) {
			int elemento = getFila()[i];
			int j = i - 1;

			while ((j >= 0) && (elemento <= getFila()[j])) {
				getFila()[j + 1] = getFila()[j];
				j--;
			}
			getFila()[j + 1] = elemento;
		}
	}

	/* Fila */
	public static int[] getFila() {
		return fila;
	}

	/* Dimensao da Fila */
	public static int getDimensaoFila() {
		return dimensaoFila;
	}

}
