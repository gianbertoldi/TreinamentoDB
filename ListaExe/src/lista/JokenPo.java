package lista;

import java.util.Random;

public class JokenPo {
private String win;
public int jogador;
private int ia;

public String getWin() {
	while (jogador != 0) {
		switch(jogador) {
		case 0:
			System.out.println("Voce desitiu de jogar");
			break;
		case 1:
			switch(ia) {
			case 0:
				System.out.println("Deu empate");
				break;
			case 1:
				System.out.println("O computador Ganhou");
				break;
			case 2:
				System.out.println("O voce Ganhou");
				break;
			}
			break;
		case 2:
			switch(ia) {
			case 0:
				System.out.println("O voce Ganhou");
				break;
			case 1:
				System.out.println("Deu empate");
				break;
			case 2:
				System.out.println("O computador Ganhou");
				break;
			}
		case 3:
			switch(ia) {
			case 0:
				System.out.println("O computador Ganhou");
				break;
			case 1:
				System.out.println("O voce Ganhou");

				break;
			case 2:
				System.out.println("Deu empate");
				break;
			}
		default:
			System.out.println("Escolah um numero valido de 1 a 3");
			break;
		}
	}
	return win;
}
public void setWin(String win) {
	this.win = win;
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
