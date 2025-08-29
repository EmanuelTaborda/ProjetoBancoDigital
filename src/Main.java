public class Main {
    public static void main(String[] args) {

        Cliente emanuel = new Cliente("Emanuel");

        ContaCorrente cc = new ContaCorrente(emanuel);

        cc.depositar(250);

        cc.imprimirExtrato();

        cc.sacar(100);

        cc.imprimirExtrato();
    }
}