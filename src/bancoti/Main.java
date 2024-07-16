package bancoti;

public class Main {

	public static void main(String[] args) {
		
		IConta cc = new ContaCorrente();
		IConta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
