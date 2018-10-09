import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    @Test
    public void Cliente() {
        Cliente c = new Cliente();
        
        String nome1 = "Flávia Nunes";
        c.setNome(nome1);
        Assert.assertEquals(nome1, c.getNome());
        
        String nome2 = "";
        c.setNome(nome2);
        Assert.assertEquals("77", c.getNome());

        String endereco1 = "Rua dos Inconfidentes, Numero 122";
        c.setEndereco(endereco1);
        Assert.assertEquals(endereco1, c.getEndereco());
        
        String endereco2 = "";
        c.setEndereco(endereco2);
        Assert.assertEquals("78", c.getEndereco());
        
        long telefone1 = 35515080;
        c.setTelefone(telefone1);
        Assert.assertEquals(telefone1, c.getTelefone());
        
        //Teste que não vai passar
        long telefone2 = 0;
        c.setTelefone(telefone2);
        Assert.assertEquals(79, c.getTelefone());
    }
}