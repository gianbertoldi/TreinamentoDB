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
				+ "4. Calculadora \n"
				+ "5. Tabuada \n"
				+ "6. 10 numeros aleatrios e motrar o menor e maior \n"
				+ "8. Ate digitar 10 \n"
				+ "9. para serie Fibonacci \n"
				+ "0. Fechar programa");
	}
	
	public void tabuada() {
		System.out.println("Este algoritimo é para ver a tabuada \n"
				+ "Digite o qual tabuada deseja verificar: ");
	}
	
	public void continuar() {
		System.out.println("Deseja executar outro exercio? [S] ou [N]");
	}
	
	public void iniJokenPo() {
		System.out.println("Vamos jogar JokenPo!! \n"
				+ "1. pedra \n"
				+ "2. papel \n"
				+ "3. tesoura \n"
				+ "0. desistir");
	}
	
	public void opera() {
		System.out.println("Vamos calcular: \n"
				+ "Selecione o tipo de operação que deseja fazer \n"
				+ "+ para adição \n"
				+ "- para subtração \n"
				+ "* multiplicação \n"
				+ "/ para divisão \n"
				+ "p para potencia \n"
				+ "r para fazer uma raiz quadrada \n"
				+ "f para cancelar");
	}
	
	public void incCal() {
		System.out.print("Qual o primeiro valor: " );
	}
	
	public void segCal() {
		System.out.print("Qual o segundo valor: " );
	}
	
	public void fib() {
		System.out.println("Iniciando serie Fibonacci");
	}
	public void matrizQua() {
		
	}
}
