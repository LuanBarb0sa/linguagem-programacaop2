import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Inicializando objetos
		Venda venda = new Venda();
		Vendedor vendedor = new Vendedor();
		
		// Inicia variável da opção!
		Integer result;
		
		//Condicional Menu
		Boolean menu = true;
		
		while (menu == true) {
			
			//Opções Menu
			System.out.println("Digite 1 para cadastrar um vendedor.");
			System.out.println("Digite 2 para registrar uma venda.");
			System.out.println("Digite 3 para exibir o status da venda.");
			System.out.println("Digite 100 para encerrar o programa.");
			result = sc.nextInt();
			
			if (result .equals(100)) {
				System.out.println("Programa encerrado!");
				menu = false;
			} else if (result != 1 && result != 2 && result != 3) {
				System.out.println("Digite uma opção válida!");
				menu = true;
			}
			
			//condicional para cadastrar vendedor
			if (result == 1) {
				vendedor.cadastrar();
			}
			
			// condicional para cadastrar venda
			if (result == 2) {
				venda.cadastrarVenda();
			}
			
			if (result == 3) {
				vendedor.status();
				venda.status();
			}
			
			
		}
		System.out.println("Programa encerrado!");
		
		sc.close();
	}
}
