
public class TestaCaracteres {

	public static void main (String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		// com isso, você define que o valor da soma vai ser transformado em char
		System.out.println(valor);
		
		String palavra = "Curso de java foda pra caralho";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		//string converte isso automaticamente para string em forma de cocatenação
		System.out.println(palavra);
	}
}
