package tratamentodeexceções;

public class ValorNegativoException extends Exception {



    public ValorNegativoException(double valor) {
        this.valor = valor;
    }
    private final double valor;

    public double getValor(){
        return valor;
    }
}
