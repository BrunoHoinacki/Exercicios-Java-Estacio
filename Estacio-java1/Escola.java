import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Escola {
    // Atributos
    private String nome, CNPJ;
    private List<Departamento> departamentos; // Ajuste do tipo
    private List<Aluno> discentes; // Ajuste do tipo
    private Endereco endereco;

    // Construtor
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<>();
        this.discentes = new ArrayList<>();
    }

    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento(nomeDepartamento));
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos() {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();

        // Agrupar alunos por naturalidade
        for (Aluno a : discentes) {
            if (!agrupamento.containsKey(a.recuperarNaturalidade())) {
                agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
            }
            agrupamento.get(a.recuperarNaturalidade()).add(a);
        }

        // Construir a saída formatada
        StringBuilder resultado = new StringBuilder("Resultado do agrupamento por naturalidade:\n");
        for (Map.Entry<String, List<Aluno>> entrada : agrupamento.entrySet()) {
            resultado.append(entrada.getKey()).append(": ");
            for (Aluno aluno : entrada.getValue()) {
                resultado.append(aluno.toString()).append(", ");
            }
            // Remover a vírgula extra e adicionar nova linha
            resultado.setLength(resultado.length() - 2);
            resultado.append("\n");
        }

        // Exibir o resultado formatado
        System.out.print(resultado.toString());
    }
}