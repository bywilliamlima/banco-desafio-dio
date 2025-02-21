package bancoti;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 0001;
	private static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	

	
		public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirinformacoesComuns() {
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Numero: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
	}


	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

}
