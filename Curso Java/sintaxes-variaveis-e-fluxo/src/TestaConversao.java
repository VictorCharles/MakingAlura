
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;

		//float pontoFlutuante = (float) 3.14;
		//float pontoFlutuante = 3.14f;
		// Nesse caso de usar float, ambos dão na mesma
		// Colocar a letra f no final serve para identificar que o valor é float

		int valor = (int) salario;
		//  Para fazer uma conversão onde pode haver perda de informações é necessário fazer um type casting. Veja a instrução abaixo.
		// sem casting ele não compila
		System.out.println(valor);
		
		long numeroGrande = 123124319371L;
		short valorPequeno = 2131;
		byte b = 127;
		
		/*boolean	1 bit
		byte	1 byte
		short	2 bytes
		char	2 bytes
		int	4 bytes
		float	4 bytes
		long	8 bytes
		double	8 bytes */
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		// POR ISSO QUE NÂO DEVE USAR DOUBLE PARA DINHEIRO
	}

}
