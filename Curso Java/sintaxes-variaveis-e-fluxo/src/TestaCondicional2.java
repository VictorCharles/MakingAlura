
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		//vai deixar acompanhado em true, como se fosse assim
				/*if (quantidadePessoas>=2) {
					boolean acompanhado=true;
				}else {
					boolean acompanhado=false;
				}*/
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");

		}
	}
}
