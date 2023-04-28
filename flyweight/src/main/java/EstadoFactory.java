import java.util.HashMap;
import java.util.Map;

public class EstadoFactory {
    private static Map<String, Estado> estados = new HashMap<>();

    public static Estado getEstado(String nome) {
        Estado estado = estados.get(nome);
        if (estado == null) {
            estado = new Estado(nome, uf);
            estados.put(nome, estado);
        }
        return estado;
    }

    public static int getTotalEstados() {
        return estados.size();
    }
}
