import java.util.Iterator;
import java.util.Vector;

public class Pedido {

    //posicao no vetor produtos dos produtos que o cliente pediu
    private Vector produtosPedido = new Vector();
    Iterator p = produtosPedido.iterator();
    //quantidade de cada produto
    private int quantProdutos[];
    //total R$ do pedido
    private double totalPedido;
    //produtos no estoque
    private Produto produtos = new Produto();
    
    private Cliente cliente = new Cliente();

    private int status;

    //construtors
    Pedido() {
        this.totalPedido = 0;
        this.status = 99;
        //inicia os produtos
        setProdutos();
    }

     //função que verifica se o produto é valido
    int addProduto(int codigo) {
        int aux = -1;
        //verifica se os códigos dos produtos não tem 4 digitos
        if (Integer.toString(codigo).length() != 4) {
            //erro
            return 91;
        }
        //verifica se os códigos dos produtos estão cadastrados
        for (int j = 0; j < produtos.getCodigos().length; j++) {
            if (codigo == produtos.getUmCodigo(j)) {
                aux = j;
            }
        }
        if (aux == -1) {
            //erro, produto não cadastrado
            return 92;
        }

        //codigo valido, adicionar ao pedido
        produtosPedido.add(aux);
        return codigo;
    }

    double calcularValorTotal(double[] valor) {
        double soma = 0;
        int aux = 0;
        while(p.hasNext()){
            soma+= produtos.getUmCodigo(aux) * valor[aux];
            aux++;
        }

        return soma;
    }
    //  set/get

    void setProdutos() {
        int[]codigos = {1234, 4321, 4598, 9999 };
        double[] valores = {10, 30, 5, 10};

        produtos.setCodigos(codigos);
        getProdutos().setValores(valores);

    }




    public Produto getProdutos() {
        return produtos;
    }


}
