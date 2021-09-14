package erros;

public class Aplicaco {
    public static void main(String[] args) {


        ContatoPF c1 = new ContatoPF();
        c1.setNome("Fantunes");
        c1.setCpf("222.222.222.22");



        c1.getEndereço().setRua("R Happy");
        c1.getEndereço().setNumero("98");
        c1.getEndereço().setCidade("São paulo");
        c1.getEndereço().setEstado("São Paulo");




    }
}
