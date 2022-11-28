import java.util.Scanner;

public class Vendedor {

	Scanner sc = new Scanner(System.in);

	String nome;
	String nomeLoja;
	Integer codigo;

	public Vendedor() {
		return;
	}
	
	public void cadastrar() {
		System.out.println("Digite o nome do vendedor: ");
		this.nome = sc.nextLine();
		this.setNome(nome);
		System.out.println("Digite o Nome da Loja: ");
		this.nomeLoja = sc.nextLine();
		this.setNomeLoja(nomeLoja);
		System.out.println("Digite o código do vendedor: ");
		this.codigo = sc.nextInt();
		this.setCodigo(codigo);
	}
	
	public void status () {
		System.out.println("####DADOS VENDEDOR####");
		System.out.println("Vendedor: " + this.getNome());
		System.out.println("Loja:" + this.getNomeLoja());
		System.out.println("Código: " + this.getCodigo());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
