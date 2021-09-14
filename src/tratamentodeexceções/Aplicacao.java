package tratamentodeexceções;

public class Aplicacao {
    public static void main(String[] args)  {

        ContaBancaria c = new ContaBancaria(1000);
        try {
            c.sacar(300);
        } catch (ValorNegativoException e) {
            System.out.println("Você tentou sacar um valor negativo de " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Você tentou sacar " +e.getValor() + " mas ´so tem um saldo de " + e.getSaldo());
        } finally {
            System.out.println(c.getSaldo());
        }


    }
}
