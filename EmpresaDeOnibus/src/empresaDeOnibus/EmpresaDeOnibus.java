package empresaDeOnibus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaDeOnibus {

	public static int rotas;
	public static int passageiros;
	
	public static void main(String[] args) {
		EmpresaDeOnibus.rota(null);
		
	}
	public static void rota(Scanner key) {
		System.out.println("Qual a rota?");
		EmpresaDeOnibus.getRotas();
		
	}
	public static int getRotas() {
		Scanner key =  new Scanner(System.in);
		int cont = 0;
		List<Integer> rota =  new ArrayList<>();
		List<Integer> passagero = new  ArrayList<>();
		rotas =  key.nextInt();
		while(rotas != 0) {
			if(!rota.contains(rotas)){
				rota.add(rotas);
				System.out.println("rota inclusa com sucesso");
				
				rotas =  key.nextInt();
			}else {
				System.out.println("Ja inclusa a rota");
				rotas =  key.nextInt();
			}
		}
		return rotas;
	}
	public static void setRotas(int rotas) {
		EmpresaDeOnibus.rotas = rotas;
	}
	
	public static int getPassageiros() {
		
		
		return passageiros;
	}
	public static void setPassageiros(int passageiros) {
		EmpresaDeOnibus.passageiros = passageiros;
	}
	
}
