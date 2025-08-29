public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo()<valor) {
            System.out.println("Saldo insuficiente para sacar!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo atual: " + getSaldo());
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("R$%.2f depositado com sucesso na conta de %s.\n", getSaldo(), getCliente());
    }

    @Override
    public void transferirValor(double valor, IConta contaDestino) {
        if (getSaldo()>valor) {
            System.out.println("Transferência realizada com sucesso.");
            saldo -= valor;
            contaDestino.depositar(valor);
        }else {
            System.out.println("Valor insuficiente para transferir.");
        }

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

    public String getCliente() {
        return cliente.getNome();
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

