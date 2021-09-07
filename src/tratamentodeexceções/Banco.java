package tratamentodeexceções;

public class Banco {

    public void realizarOperacao() throws ValorNegativoException , SaldoInsuficienteException {
        ContaBancaria c = new ContaBancaria(1000);

        c.sacar(1500);
        System.out.println("Saque realizado com sucesso");
        System.out.println(c.getSaldo());
    }

}
