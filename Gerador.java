
public class Gerador {
	
	private static int senhaNormal = -1;
	private static int senhaPreferencial = 0;

	/*Gerador de Senha Normal*/
	public static int senhaNormal() {
		if (Fila.getDimensaoFila() > 0 && (Fila.getFila()[Fila.getDimensaoFila() - 1]) % 2 == 0) {
			senhaNormal = Fila.getFila()[Fila.getDimensaoFila() - 1] + 1;
		} else {
			senhaNormal += 2;
		}
		return senhaNormal;
	}
	
	/*Gerador de Senha Preferencial*/
	public static int senhaPreferencial() {
		senhaPreferencial += 2;
		return senhaPreferencial;
	}
	
	/*Senha Normal*/
	public static int getSenhaNormal() {
		return senhaNormal;
	}
	
	/*Senha Preferencial*/
	public static int getSenhaPreferencial() {
		return senhaPreferencial;
	}

}
