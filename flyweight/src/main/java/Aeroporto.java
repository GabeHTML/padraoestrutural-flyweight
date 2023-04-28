import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(String nomeCliente,int cpf, String uf) {
        Estado estado = EstadoFactory.getEstado(uf);
        Cliente cliente = new Cliente(nomeCliente,cpf, estado);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }
}
