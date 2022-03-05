package POOInterface;

public interface Figuras { // DECLARANDO INTERFACE
	
	// ATRIBUTO
	public String nomeInterface = "Figuras"; 
	
	// M�TODOS ABSTRATOS
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	// M�TODOS N�O ABSTRATOS
	public double getArea(); 
	public double getPerimetro();
	double getDiagonal();
}
