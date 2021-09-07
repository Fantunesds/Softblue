package tratamentodeexceções;

public class Aplicacao {
    public static void main(String[] args)  {

        Banco banco = new Banco();
        try {
            banco.realizarOperacao();
        } catch (ValorNegativoException e) {
            System.out.println("Você tentou sacar um valor negativo de " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Você tentou sacar " +e.getValor() + " mas ´so tem um saldo de " + e.getSaldo());
        }


    }
}
