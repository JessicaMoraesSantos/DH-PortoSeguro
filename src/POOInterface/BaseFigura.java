package POOInterface;

public class BaseFigura { // SUPER CLASSE
	
	// ATRIBUTOS 
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	// CONSTRUTOR
	BaseFigura(double lado1, double lado2, String nome)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}
	
	// M�TODO
	public double getArea()
	{ // ESSE M�TODO EXISTE NA INTERFACE
		return lado1 * lado2; // IMPLEMENTANDO M�TODO
	}
	
	public double getPerimetro()
	{ // ESSE M�TODO EXISTE NA INTERFACE
		return (lado1 + lado2) * 2.0; // IMPLEMENTANDO M�TODO
	}
	
	public String getNome()
	{ // ESSE M�TODO EXISTE NA INTERFACE
		return nome;
	}
	
	public void setNome(String nome)
	{ // ESSE M�TODO EXISTE NA INTERFACE
		this.nome = nome; // IMPLEMENTANDO M�TODO
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
}


	
