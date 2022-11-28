import java.util.Scanner;

public class Venda{

	Scanner sc = new Scanner(System.in);

	Double valor;
	String dataVenda;

	public Venda() {
		return;
	}
	
	public void cadastrarVenda() {
		System.out.println("Digite o valor da venda: ");
		valor = sc.nextDouble();
		this.setValor(valor);
		System.out.println("Digite a data da venda: ");
		dataVenda = sc.next();
		this.setDataVenda(dataVenda);
	}
	
	public void status() {
		System.out.println("####DADOS VENDA####");
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data venda: " + this.getDataVenda());
	}

	protected Double getValor() {
		return valor;
	}

	private void setValor(Double valor) {
		this.valor = valor;
	}

	protected String getDataVenda() {
		return dataVenda;
	}

	private void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

}
