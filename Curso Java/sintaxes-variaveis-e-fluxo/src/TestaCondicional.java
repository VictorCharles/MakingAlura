
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condionais");
		int idade = 20;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar, "
						+ "pois est� acompanhado ");
			} else {
				System.out.println("infelizmente voc� n�o pode entrar");
			}
		}
	}
}