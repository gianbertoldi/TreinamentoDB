package lista;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		char cont;
		Scanner key = new Scanner(System.in);
		Tela  tela =  new Tela();
		tela.inicio();
		int menu= key.nextInt();
		
		while(menu != 0) {
			switch(menu) {
			case 1:
				MaiorIdade idi =  new MaiorIdade();
				idi.pergunta();
				idi.setIdade(key.nextInt());
				idi.tela();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					menu = key.nextInt();
				}else if (cont == 'n'){
					menu = 0;
				}
				break;
			case 3:
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
					menu = key.nextInt();
				}else if (cont == 'n'){
					menu = 0;
				}
				break;
			case 2:
				JokenPo jk =  new JokenPo();
				tela.iniJokenPo();
				jk.jogador = key.nextInt();
				jk.getWin();
				
				tela.continuar();
				cont = key.next().charAt(0);
				if (cont == 's') {
					tela.inicio();
					menu = key.nextInt();
				}else if (cont == 'n'){
					menu = 0;
				}
				break;
			}
		}
		System.out.println("Fim do programa");
	}

}
