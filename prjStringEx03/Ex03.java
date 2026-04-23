package prjStringEx03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String texto = "01111101010000101";
	        int contador = 0;

	        for (int i = 0; i < texto.length(); i++) {
	            if (texto.charAt(i) == '1') {
	                contador++;
	            }
	        }

	        System.out.println("Quantidade de 1's: " + contador);
	    }
	}
