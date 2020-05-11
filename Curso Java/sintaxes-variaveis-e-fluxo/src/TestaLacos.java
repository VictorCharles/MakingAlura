
public class TestaLacos {
	
	public static void main(String[] args) {
		for(int multiplicador=1; multiplicador<=10; multiplicador++) {
			for(int contador=1; contador <=10; contador++) {
				System.out.print(contador + " x " + multiplicador + " = " + (multiplicador*contador));
				if (multiplicador < 10) {
				System.out.print("   | ");
				}
				else {
					System.out.print(" |  ");
				}
			}
			System.out.println();
		}
	}
}
