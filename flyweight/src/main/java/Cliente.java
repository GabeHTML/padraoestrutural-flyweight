public class Cliente {
    private String nome;

    private int cpf;
    private Estado estadoReside;

    public Cliente(String nome,int cpf, Estado estadoReside) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoReside = estadoReside;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                "CPF='" + this.cpf + '\'' +
                ", uf='" + estadoReside.getUf() + '\'' +
                '}';
    }
}
