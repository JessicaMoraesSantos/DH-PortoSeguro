package POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		// INSTANCIANDO OBJETO DA CLASSE AUTOMOVEL
		Automovel auto = new Automovel("Jessica Moraes", "Jeep", "JMS1L08", 2021);
		
		auto.imprimirInfo();
		System.out.println("\n***********************************");
		System.out.println("\n***Transfer�ncia de propriet�rio***");
		auto.setNomeProprietario("Emilly Pellini");
		System.out.println("\n***********************************");
		auto.imprimirInfo();
		

	}

}
