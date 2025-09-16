import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void testGetNome() {
        Cliente cliente = new Cliente("Emanuel");
        assertEquals("Emanuel", cliente.getNome());
    }

    @Test
    public void testSetNome() {
        Cliente cliente = new Cliente("Emanuel");
        cliente.setNome("Thayna");
        assertEquals("Thayna", cliente.getNome());
    }
}