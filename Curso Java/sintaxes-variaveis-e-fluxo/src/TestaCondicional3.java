/* Um exemplo, temos uma vari�vel mes, precisamos 
 * testar o seu n�mero e imprimir o seu m�s correspondente.
 * Ent�o, vamos fazer 12 ifs?
 *
 * Para esses casos, existe o comando switch, onde podemos 
 * colocar todas as op��es ou rumos que o nosso programa 
 * pode tomar. Ele funciona da seguinte maneira:*/

public class TestaCondicional3 {

	public static void main(String[] args) {
		int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("O m�s � Janeiro");
                break;
            case 2:
                System.out.println("O m�s � Fevereiro");
                break;
            case 3:
                System.out.println("O m�s � Mar�o");
                break;
            case 4:
                System.out.println("O m�s � Abril");
                break;
            case 5:
                System.out.println("O m�s � Maio");
                break;
            case 6:
                System.out.println("O m�s � Junho");
                break;
            case 7:
                System.out.println("O m�s � Julho");
                break;
            case 8:
                System.out.println("O m�s � Agosto");
                break;
            case 9:
                System.out.println("O m�s � Setembro");
                break;
            case 10:
                System.out.println("O m�s � Outubro");
                break;
            case 11:
                System.out.println("O m�s � Novembro");
                break;
            case 12:
                System.out.println("O m�s � Dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        }
        /*Break interrompe a execu��o do switch (caso) 
         *para os outros n�o serem executados, e se nenhuma 
         *condi��o for aceita, o codigo DEFAULT � executado */
	}
}
//switch � uma solu��o pra ifs encadeados