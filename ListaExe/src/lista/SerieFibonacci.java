package lista;

public class SerieFibonacci {
	private int num1 = 1;
	private int num2 = 0;
	
	public void serie() {
		System.out.print("0" + " " + "1" + " ");
		for (int i = 0; i < 7; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.print(" " + num1 + " ");
		}
		System.out.println("");
	}

}
