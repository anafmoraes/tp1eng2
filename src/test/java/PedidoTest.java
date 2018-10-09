import org.junit.Assert;
import org.junit.Test;

public class PedidoTest {

    @Test
    public void testCodigoProduto() {
        Pedido p = new Pedido();
        Assert.assertEquals(1234, p.addProduto(1234));
        Assert.assertEquals(91, p.addProduto(999));
        Assert.assertEquals(4321, p.addProduto(4321));
        Assert.assertEquals(9999, p.addProduto(9999));
        Assert.assertEquals(91, p.addProduto(10000));
        Assert.assertEquals(91, p.addProduto(12345));
        Assert.assertEquals(92, p.addProduto(1111));
    }

    @Test
    public void testValorTotal() {

    }

}