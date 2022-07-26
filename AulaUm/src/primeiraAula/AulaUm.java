package primeiraAula;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AulaUm {
	
	static String opc() {
		return "Qual exercio deseja Iniciar? \n"
				+ "1 -> Ola Mundo \n"
				+ "2 -> mostrando tipos \n"
				+ "3 -> Calculo de uma area inteira \n"
				+ "4 -> soma em double \n"
				+ "5 -> Incremento e descremento \n"
				+ "0 -> Finaliza o programa";
	}
	static String conti() {
		return "Deseja selecionar outro exercicio? \n"
				+ "s =  Sim \n"
				+ "n = Não";
	}
	static int Menu(int x) {
		int menu = x;
		return menu;
	}
	static int Area(int a, int b) {
		int area = a*b;
		return area;
	}

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("0.00");
		Scanner key = new Scanner(System.in);
		int temp;
		char cont;
		System.out.println(opc());
		temp = Menu(key.nextInt());
		System.out.println("-------------------------------- \n");
		
		while (temp != 0) {
			switch (temp) {
				case 1:
					System.out.println("Ola mundo!");
					System.out.println("-------------------------------- \n");
					System.out.println(conti());
					
					cont = key.next().charAt(0);
					
					if (cont == 's') {
						System.out.println(opc());
						temp = key.nextInt();
					}else if (cont == 'n'){
						temp = 0;
					}
					break;
				case 2:
					int lado = 2;
					double pi = Math.PI;
					String nome = "Fulano";
					char letra = 'M';
					boolean brasileiro = true; 
					System.out.println(" tipo Inteiro " + lado);
					System.out.println("tipo double " + dec.format(pi));
					System.out.println("tipo String " + nome);
					System.out.println("tipo char " + letra);
					System.out.println("Tipo boolean" + brasileiro);
					System.out.println(conti());
					cont = key.next().charAt(0);
					
					if (cont == 's') {
						System.out.println(opc());
						temp = key.nextInt();
					}else if (cont == 'n'){
						temp = 0;
					}
					
					break;
				case 3:
					System.out.println("Quais os valores da area? ");
					int ar = Area(key.nextInt(), key.nextInt());
					System.out.println("O tamanho da Area é: " + ar);
					
					System.out.println(conti());
					cont = key.next().charAt(0);

					if (cont == 's') {
						System.out.println(opc());
						temp = key.nextInt();
					}else if (cont == 'n'){
						temp = 0;
					}
					break;
				case 4:
					double c, d, soma;
					System.out.println("Qual primeiro valor da soma? ");
					c = key.nextDouble();
					System.out.println("Qual segundo valor da area? ");
					d= key.nextDouble();
					soma  = c+d;
					System.out.println("a soma é: " + soma);
					System.out.println("-------------------------------- \n");
					System.out.println(conti());
					cont = key.next().charAt(0);
					
					if (cont == 's') {
						System.out.println(opc());
						temp = key.nextInt();
					}else if (cont == 'n'){
						temp = 0;
					}
					break;
				/*case 5: 
					System.out.println("Qual primeiro valor de incremento? ");
					a =  key.nextInt();
					System.out.println("Qual segundo valor da incremento? ");
					b = key.nextInt();
					a++;
					b--;
					System.out.println("foi incrementado 1 no valor a e ficou " + a);
					System.out.println("foi retirado 1 no valor b e ficou " + b);
					System.out.println("-------------------------------- \n");
					System.out.println(conti());
					cont = key.next().charAt(0);
					
					if (cont == 's') {
						System.out.println(opc());
						x = key.nextInt();
					}else if (cont == 'n'){
						x = 0;
					}
					break;*/

				default:
					System.out.println("selecione um dos numeros citados");
					System.out.println(opc());
					temp = key.nextInt();
					break;
			}
		}
		System.out.println("fim do programa");
	}

}
