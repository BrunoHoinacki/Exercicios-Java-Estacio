import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

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
        // Agrupar alunos por naturalidade utilizando Collectors.groupingBy
        // Usando Set para garantir que os alunos sejam únicos dentro de cada grupo
        Map<String, Set<Aluno>> agrupamento = discentes.stream()
                .collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, Collectors.toSet()));

        // Construir a saída formatada
        StringBuilder resultado = new StringBuilder("Resultado do agrupamento por naturalidade:\n");

        // Iterar sobre o mapa de agrupamentos
        agrupamento.forEach((naturalidade, alunos) -> {
            // Criar uma string com os alunos de uma naturalidade, separados por vírgula
            String alunosFormatados = alunos.stream()
                    .map(Aluno::toString)
                    .collect(Collectors.joining(", "));

            // Adicionar o resultado ao StringBuilder
            resultado.append(naturalidade).append(": ").append(alunosFormatados).append("\n");
        });

        // Exibir o resultado formatado
        System.out.print(resultado.toString());
    }

}