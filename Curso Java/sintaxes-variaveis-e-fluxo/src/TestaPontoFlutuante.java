
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("meu salario é" + salario);
		
		double idade = 37;
		System.out.println(idade);
				
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0 / 2;
		//tem que botar o ".0" pra o java identificar como double
		//se não o java identifica como inteiro. Sendo um dos valores double ele roda tranquilo
		System.out.println(novaTentativa);
	}
}
