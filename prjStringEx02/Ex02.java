package prjStringEx02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "osso";

		System.out.println("Nome ordem correta");
		for (int i = 0; i < nome.length();i++) {
			System.out.println(nome.charAt(i));
		}
		System.out.println("nome ordem inversa");
		for (int i = nome.length()-1;i>=0 ;i--) {
			System.out.println(nome.charAt(i));
		}
	}
}

