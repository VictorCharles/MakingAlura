
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//quanto vale o segundo?
		//n�o � referencia, isso � atribuir o valor. ent�o � 5
		System.out.println(segundo);
	}
}
