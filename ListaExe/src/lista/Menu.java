package lista;

import java.util.Scanner;

public class Menu{

	private static Scanner key;

	public static void main(String[] args) {
		char cont;
		key = new Scanner(System.in);
		
		Tela  tela =  new Tela();
		tela.inicio();
		tela.menu = key.nextInt();
		
		while(tela.getMenu() != 0) {
			switch(tela.getMenu()) {
			case 1:
				MaiorIdade idi =  new MaiorIdade();
				idi.pergunta();
				idi.setIdade(key.nextInt());
				idi.tela();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
				
			case 2:
				DescontoDoMercado desc =  new DescontoDoMercado();
				desc.perguntaNome();
				desc.nome = key.next();
				desc.perguntaQuantidade();
				desc.quantidade = key.nextInt();
				desc.perguntaPreco();
				desc.preco = key.nextDouble();
				desc.tela();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
				
			case 3:
				JokenPo jk =  new JokenPo();
				tela.iniJokenPo();
				jk.jogador = key.nextInt();
				jk.getWin();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			case 4:
				Calculadora calc =  new Calculadora();
				tela.opera();
				calc.oper = key.next().charAt(0);
				tela.incCal();
				calc.priVal = key.nextDouble();
				tela.segCal();
				calc.segVal = key.nextDouble();
				calc.getTela();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			case 5:
				Tabuada tab = new Tabuada();
				tela.tabuada();
				tab.val = key.nextInt();
				tab.tela();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			case 6:
				NumeroAleatorio na = new NumeroAleatorio();
				na.ale();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			case 7:
				
				break;
			case 8:
				//tão simples que nem fiz uma classe kk
				int ate;
				System.out.println("Digite o valor");
				ate = key.nextInt();
				while(ate != 10) {
					System.out.println("Digite o proximo valor \n"
							+ "10 para finalizar");
					ate = key.nextInt();
					
					
				}
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			case 9:
				SerieFibonacci fib = new SerieFibonacci();
				tela.fib();
				
				fib.serie();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			case 10:
				
				break;
			case 20:
				Pessoa p = new Pessoa("Um nome ", "Um sobrenome", 21);
				p.print();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					tela.menu = key.nextInt();
				}else if (cont == 'n'){
					tela.menu = 0;
				}
				break;
			}
		}
		System.out.println("Fim do programa");
	}

}
