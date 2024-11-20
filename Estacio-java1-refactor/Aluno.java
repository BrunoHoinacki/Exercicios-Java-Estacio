import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Aluno {
    // Atributos    
    private String matricula, nome, naturalidade;

    // Construtor
    public Aluno(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    public String recuperarNaturalidade() {
        return naturalidade;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", nome, naturalidade);
    }
}
