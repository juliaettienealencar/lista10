package prjStringEx01A;

public class Ex01a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dorEamor = "saudades";
		System.out.println("Ocomprimento da String texto é: " + dorEamor.length());
		
		String txt = "saudades";
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());
		
		String dorEamor1 = "saudades";
		int contadorVogais = 0;

		for (int i = 0; i < dorEamor1.length(); i++) {
		    char letra = dorEamor1.charAt(i);

		    if (letra == 'a' || letra == 'e' || letra == 'i' || 
		        letra == 'o' || letra == 'u' ||
		        letra == 'A' || letra == 'E' || letra == 'I' || 
		        letra == 'O' || letra == 'U') {
		        
		        contadorVogais++;
		    }
		}

		System.out.println("Número de vogais: " + contadorVogais);
		
	}
}