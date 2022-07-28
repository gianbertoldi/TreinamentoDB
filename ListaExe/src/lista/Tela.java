package lista;

public class Tela {
	public int menu;

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public void inicio() {
		System.out.println("Escolha o exercio que deseja abrir: \n"
				+ "1. Maior idade \n"
				+ "2. Desconto do mercado \n"
				+ "3. JokenPo \n"
				+ "8. Ate digitar 10 \n"
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
