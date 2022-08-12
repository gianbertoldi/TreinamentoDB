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
		
		EmpresaDeOnibus.getRotas();
		
	}
	public static int getRotas() {
		Scanner key =  new Scanner(System.in);
		int cont = 0;
		List<Integer> rota =  new ArrayList<>();

		int pass[] =  new int[20];
		int i = 0;
		rotas =  2;
		
		while(rotas != 0) {
			System.out.println("Qual a rota?");
			rotas =  key.nextInt();
			if((!rota.contains(rotas)  && (rotas != 0))){
				rota.add(rotas);
				pass[i] = getPassageiros(key);
				i++;
				System.out.println("rota inclusa com sucesso");
			}else if ((rota.contains(rotas)  && (rotas != 0))){
				System.out.println("rota ja inclusa");
				pass[i] += getPassageiros(key);
			}
		}

		for (i = 0; i < rota.size(); i++) {
			System.out.println(rota.get(i) + " passagero nela " + pass[i]);
		}
		return rotas;
	}
	public static void setRotas(int rotas) {
		EmpresaDeOnibus.rotas = rotas;
	}
	
	public static int getPassageiros(Scanner key) {
		System.out.println("quantos passageiros foram nesta viagem?");
		passageiros =key.nextInt();
		return passageiros;
	}
	public static void setPassageiros(int passageiros) {
		EmpresaDeOnibus.passageiros = passageiros;
	}
	
}
