
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando escopo");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		//vai deixar acompanhado em true, como se fosse assim
		//A variavel só existe dentro do escopo
		/*if (quantidadePessoas>=2) {
			//aqui ela não existe
			boolean acompanhado=true;
			//aqui ela existe
		}
		//aqui ela deixa de existir
		else {
			//Aqui ela n existe
			boolean acompanhado=false;
			//aqui ela existe
		}
		//aqui ela não existe mais*/
		
		//se ela fosse declarada antes, e dentro dos if só fosse a atribuição de valores, o codigo funcionaria perfeitamente
		boolean acompanhado;
		if (quantidadePessoas>=2) {
			//aqui ela não existe
			acompanhado=true;
			//aqui ela existe
		}
		//aqui ela deixa de existir
		else {
			acompanhado=false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");

		}
		
	}

}
