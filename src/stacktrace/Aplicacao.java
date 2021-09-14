package stacktrace;

public class Aplicacao {
    public static void main(String[] args) {

        Pista p = new Pista();

        try {
            p.iniciar();
        }catch (PistaException e){
            System.out.println("não sei o que aconteceu");
        }

    }
}
