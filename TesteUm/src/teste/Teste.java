package teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu;

		JOptionPane.showConfirmDialog(null, "Iniciando programa", null, 0);
		
		menu = JOptionPane.showInputDialog(null, "Qual a opçao do programa que ira iniciar \n digite o numero "
				+ "correspondente \n"
				+ "1 = ola mundo \n"
				+ "2 = teste menu \n"
				+ "0 = finalizar o programa");
		
		while(menu != "0") {
			switch (menu) {
			case "1":
				JOptionPane.showInternalMessageDialog(null, "Ola Mundo");
				break;
			case "2":
				JOptionPane.showInternalMessageDialog(null, "teste menu");
				break;
			default:
					JOptionPane.showInternalMessageDialog(null, "escolha apenas os numeros disponiveis na tela");
			break;
			}
			
		}
		//JOptionPane.showInternalMessageDialog(null, "Ola Mundo");
		//System.out.println("Ola mundo");
		
	}

}
