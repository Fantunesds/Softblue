package uncheckedException;

public class Aplicacao {
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();


        try {
            boolean igual = Comparador.comparar(null, o2);
            System.out.println(igual);
        }catch (NullPointerException e) {
            System.out.println("O objeto é nulo");
        }
    }
}
