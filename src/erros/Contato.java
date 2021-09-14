package erros;

public abstract class Contato {

    private String nome;
    private Endereco endereço;

    public String getNome() {
        if()
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereço() {
        if (endereço == null){
            endereço = new Endereco();
        }
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
}
