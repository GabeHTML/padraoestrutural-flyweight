import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class AeroportoTest {
    @Test
    void deveRetornarClientes() {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.cadastrar("Jota",1234567 ,"RJ");
        aeroporto.cadastrar("Lilia",2311200 ,"SP");
        aeroporto.cadastrar("Jorge",2405200 , "BH");
        aeroporto.cadastrar("Alice",5020500 ,"MG");

        List<String> saida = Arrays.asList(
                "Passageiro{nome='Jota', cpf=1234567, uf='MG'}",
                "Passageiro{nome='Lilia', cpf=2311200, uf='MG'}",
                "Passageiro{nome='Jorge', cpf=2405200, uf='MG'}",
                "Passageiro{nome='Alice', cpf=5020500, uf='MG'}");

        assertEquals(saida, aeroporto.obterClientes());
    }

    @Test
    void deveRetornarTotalEstados() {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.cadastrar("Jota",1234567 ,"RJ");
        aeroporto.cadastrar("Lilia",2311200 ,"SP");
        aeroporto.cadastrar("Jorge",2405200 ,"BH");
        aeroporto.cadastrar("Alice",5020500 ,"MG");

        assertEquals(2, EstadoFactory.getTotalEstados());
    }
}
