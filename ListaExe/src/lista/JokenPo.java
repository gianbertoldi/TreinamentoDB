package lista;

import java.util.Random;

public class JokenPo {
public int jogador;
private int ia;

public void getWin() {
	while (jogador != 0) {
		switch(getJogador()) {
		case 1:
			System.out.print("Voce Jogou Pedra e ");
			switch(getIa()) {
			case 0:
				System.out.println("o computador Jogo Pedra");
				System.out.println("Deu empate");
				break;
			case 1:
				System.out.println("o computador Jogo papel");
				System.out.println("O computador Ganhou");
				break;
			case 2:
				System.out.println("o computador Jogo Tesoura");
				System.out.println("Voce Ganhou");
				break;
			}
			break;
		case 2:
			System.out.print("Voce Jogou Papel e ");
			switch(getIa()) {
			case 0:
				System.out.println("o computador Jogo Pedra");
				System.out.println("Voce Ganhou");
				break;
			case 1:
				System.out.println("o computador Jogo papel");
				System.out.println("Deu empate");
				break;
			case 2:
				System.out.println("o computador Jogo Tesoura");
				System.out.println("O computador Ganhou");
				break;
			}
		case 3:
			System.out.print("Voce Jogou tesoura e ");
			switch(getIa()) {
			case 0:
				System.out.println("o computador Jogo Pedra");
				System.out.println("O computador Ganhou ");
				break;
			case 1:
				System.out.println("o computador Jogo papel");
				System.out.println("Voce Ganhou");
				break;
			case 2:
				System.out.println("o computador Jogo Tesoura");
				System.out.println("Deu empate");
				break;
			}
			break;
		case 0: 
			System.out.println("Voce desistiu de jogar");
			break;
		default:
			System.out.println("Comando Invalido!!");
		}
	}
}

public int getJogador() {
	return jogador;
}

public void setJogador(int jogador) {
	this.jogador = jogador;
}

public int getIa() {
	Random ram = new Random();
	ia = ram.nextInt(2);
	return ia;
}

public void setIa(int ia) {
	this.ia = ia;
}

}
