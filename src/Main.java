public class Main {
    public static void main(String[] args) {

        Cliente emanuel = new Cliente("Emanuel");

        ContaCorrente cc = new ContaCorrente(emanuel);

        cc.depositar(250);

        cc.sacar(100);

        Cliente thayna = new Cliente("Thayná");

        ContaPoupanca cp = new ContaPoupanca(thayna);

        cc.transferirValor(100, cp);

        cp.imprimirExtrato();

        cc.imprimirExtrato();

    }
}