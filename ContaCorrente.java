package banco2;

public class ContaCorrente {
    private String numeroConta;
    private double saldo;
    

    // Construtor da classe
    public ContaCorrente(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;

        System.out.println("");
    }
    
    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        System.out.println("");
    }
    
    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        System.out.println("");
    }
    
    // Método para obter o saldo atual da conta
    public double consultarSaldo() {
        return saldo;
       
    }
    
    // Método para imprimir informações da conta
    public void imprimirInformacoes() {
        System.out.println("Conta: " + numeroConta + " | Saldo: R$" + saldo);
        System.out.println("");
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345-6", 1000.0);
        
        conta.imprimirInformacoes();
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(1500.0);
        conta.imprimirInformacoes();

        System.out.println("");
    }
}
