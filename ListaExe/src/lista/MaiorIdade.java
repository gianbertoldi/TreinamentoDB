package lista;

public class MaiorIdade {
	static String idade(String idi) {
		String res = idi;
		int a = 0;
		if(a >= 18) {
			res = "É maior de idade";
		}else {
			res = "É menor de idade";
		}
		return res;	
	}

}
