package lista;

import java.util.Random;

public class JokenPo {
public int jogador;
private int ia;

public void getWin() {
	while (jogador != 0) {
		switch(jogador) {
		case 1:
			System.out.print("Voce Jogou Pedra e ");
			switch(getIa()) {
			case 0:
				System.out.println("O computador Jogo Pedra");
				System.out.println("Deu empate");
				break;
			case 1:
				System.out.println("O computador Jogo papel");
				System.out.println("O computador Ganhou");
				break;
			case 2:
				System.out.println("O computador Jogo Tesoura");
				System.out.println("Voce Ganhou");
				break;
			}
			break;
		case 2:
			System.out.print("Voce Jogou Papel e ");
			switch(getIa()) {
			case 0:
				System.out.println("O computador Jogo Pedra");
				System.out.println("Voce Ganhou");
				break;
			case 1:
				System.out.println("O computador Jogo papel");
				System.out.println("Deu empate");
				break;
			case 2:
				System.out.println("O computador Jogo Tesoura");
				System.out.println("O computador Ganhou");
				break;
			}
		case 3:
			System.out.print("Voce Jogou tesoura e ");
			switch(getIa()) {
			case 0:
				System.out.println("O computador Jogo Pedra");
				System.out.println("O computador Ganhou ");
				break;
			case 1:
				System.out.println("O computador Jogo papel");
				System.out.println("Voce Ganhou");
				break;
			case 2:
				System.out.println("O computador Jogo Tesoura");
				System.out.println("Deu empate");
				break;
			}
			jogador = 0;
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
