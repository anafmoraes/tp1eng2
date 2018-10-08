public class Produto {

    private int[] codigos;
    private double[] valores;


    Produto(int[] codigos, double[] valores) {
        this.codigos = codigos;
        this.valores = valores;
    }
    Produto() {

    }

    public void setCodigos(int[] codigos) {
        this.codigos = codigos;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    public double[] getValores() {
        return valores;
    }

    public int[] getCodigos() {
        return codigos;
    }
    public int getUmCodigo(int pos) {
        return codigos[pos];
    }
    public double getUmValor(int pos) {
        return valores[pos];
    }

    public double getValor(int pos) {
        return this.valores[pos];
    }
}
