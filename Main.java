import java.util.Scanner;

/*Assunto: Fila e InsertionSort
 *Grupo:Carlos Pereira
 * 	Heber Ribeiro
 * 	Henrique Lima
 * 	Ricardo Lima
 * 	Thiago Albertins*/

public class Main {

	public static void main(String[] args) {

		/* Condicao do While */
		boolean continua = true;
		
		Scanner scanner = new Scanner(System.in);

		do {
			/* Menu */
			System.out.println("\nSelecione uma opcao: \n" + "1 - Senha Normal \n" + "2 - Senha Preferencial \n"
					+ "3 - Atendimento \n" + "4 - Listar Senhas \n" + "0 - Finalizar Programa");
			try {
				/* Leitor da Opcao do Usuario */
				int menu = scanner.nextInt();
				switch (menu) {

				/* Pedir Senha Normal */
				case 1:
					Fila.inserir(Gerador.senhaNormal());
					break;

				/* Pedir Senha Preferencial */
				case 2:
					Fila.inserir(Gerador.senhaPreferencial());
					Fila.insertionSort();
					break;

				/* Chamar Senha */
				case 3:
					Fila.remover();
					break;

				/* Listar Senhas */
				case 4:
					Fila.listar();
					break;

				/* Finalizar Programa */
				case 0:
					System.out.println("Programa finalizado!");
					continua = false;
					break;

				/* Opcao Errada */
				default:
					System.out.println("Opcao incorreta!\n");
					break;
				}

				/* Excecao */
			} catch (Exception e) {
				System.out.println("Opcao incorreta!\n");
				scanner.next();
			}
		} while (continua);
		scanner.close();
	}
}
