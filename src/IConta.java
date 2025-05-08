public interface ContaModel {

    void sacar(double valor);

    void depositar (double valor);

    void transferirValor (double valor, ContaModel contaDestino);
}
