import java.util.Set;

public class Conta {
	// ATRIBUTOS
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(int agencia, int numero) {
		if(agencia > 0)
		this.agencia = agencia;
		else
			System.out.println("Agencia negativa n pode");
		
		this.numero= numero;
	}
	//INicializar um objeto com dados dos atributos
	
	public Conta(double saldo, String nome) {
		this.saldo = saldo;
		this.titular.setNome(nome);
	}
	
	public Conta() {
		this.saldo = 0;
		this.agencia = 0;
		this.numero = 0;
	}
		
	// METODOS - saldo
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	// Metodos para numero
	public int getNumero() {
		return this.numero;
	}

	private void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		} else {
			System.out.println("Numero n�o pode ser <= 0");
		}
	}

	// Metodos para agencia
	public int getAgencia() {
		return this.agencia;
	}

	private void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("Agencia invalida");
		}
	}
	
	// Metodos para cliente
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	// Metodos para o total
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

}