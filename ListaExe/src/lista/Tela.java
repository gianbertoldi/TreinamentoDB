package lista;

public class Tela {

	public void inicio() {
		System.out.println("Escolha o exercio que deseja abrir: \n"
				+ "1. Maior idade \n"
				+ "2. Desconto do mercado \n"
				+ "3. JokenPo \n"
				+ "0. Fechar programa");
	}
	
	public void continuar() {
		System.out.println("Deseja executar outro exercio? [S] ou [N]");
	}
	
	public void iniJokenPo() {
		System.out.println("Vamos jogar JokenPo!! \n"
				+ "1. pedra \n"
				+ "2. papel \n"
				+ "3. pedra \n"
				+ "0 . desistir");
	}
	
}
