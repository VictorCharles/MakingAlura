/* Um exemplo, temos uma variável mes, precisamos 
 * testar o seu número e imprimir o seu mês correspondente.
 * Então, vamos fazer 12 ifs?
 *
 * Para esses casos, existe o comando switch, onde podemos 
 * colocar todas as opções ou rumos que o nosso programa 
 * pode tomar. Ele funciona da seguinte maneira:*/

public class TestaCondicional3 {

	public static void main(String[] args) {
		int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
        /*Break interrompe a execução do switch (caso) 
         *para os outros não serem executados, e se nenhuma 
         *condição for aceita, o codigo DEFAULT é executado */
	}
}
//switch é uma solução pra ifs encadeados