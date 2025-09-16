import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {
    @Test
    public void testDepositar() {
        Cliente cliente = new Cliente("Test");
        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(100);
        assertEquals(100, cc.getSaldo(), 0.001);
    }

    @Test
    public void testSacarComSaldoSuficiente() {
        Cliente cliente = new Cliente("Test");
        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(100);
        cc.sacar(50);
        assertEquals(50, cc.getSaldo(), 0.001);
    }

    @Test
    public void testSacarComSaldoInsuficiente() {
        Cliente cliente = new Cliente("Test");
        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(30);
        cc.sacar(50);
        assertEquals(30, cc.getSaldo(), 0.001);
    }

    @Test
    public void testTransferirComSaldoSuficiente() {
        Cliente cliente1 = new Cliente("Test1");
        Cliente cliente2 = new Cliente("Test2");
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaPoupanca cc2 = new ContaPoupanca(cliente2);
        cc1.depositar(100);
        cc1.transferirValor(50, cc2);
        assertEquals(50, cc1.getSaldo(), 0.001);
        assertEquals(50, cc2.getSaldo(), 0.001);
    }

    @Test
    public void testTransferirComSaldoInsuficiente() {
        Cliente cliente1 = new Cliente("Test1");
        Cliente cliente2 = new Cliente("Test2");
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaPoupanca cc2 = new ContaPoupanca(cliente2);
        cc1.depositar(30);
        cc1.transferirValor(50, cc2);
        assertEquals(30, cc1.getSaldo(), 0.001);
        assertEquals(0, cc2.getSaldo(), 0.001);
    }
}