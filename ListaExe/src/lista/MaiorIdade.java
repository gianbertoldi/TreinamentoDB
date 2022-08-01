package lista;

public class MaiorIdade {
	public int idade;
	protected boolean maior;
	
	
	public void tela() {
		if (this.maior == true) {
			System.out.println("Checamos que é maior de idade");
		} else {
			System.out.println("Checamos que é menor de idade");
		}
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		if (idade >= 18) {
			this.maior =  true;
		}
		else {
			this.maior = false;
		}
	}
	public void pergunta() {
		System.out.println("Qual a idade que deseja verificar");
	}

}
