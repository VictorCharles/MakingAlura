
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//quanto vale o segundo?
		//não é referencia, isso é atribuir o valor. então é 5
		System.out.println(segundo);
	}
}
