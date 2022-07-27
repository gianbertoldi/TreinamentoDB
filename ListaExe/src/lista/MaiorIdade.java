package lista;

public class MaiorIdade {
	private int idade;
	private String res;

	public maiorIdade(String res, int idade) {
		setIdade(idade);
	}
	public static int getIdade(int idade) {
		return idade;
	}
	public void setIdade(int idade, String res) {
		if(idade <= 18) {
			this.idade = idade;	
			this.res = "É maior de idade.";
		}
		else {
			this.res = "É menos de idade.";
		}
		
	}
	static String Iniciando() {
		String 	res = "Qual a idade que deseja consultar?";
		return res;	
	}

}
