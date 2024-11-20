import java.util.Objects;

public class Aluno {
    // Atributos
    private String matricula, nome, naturalidade;

    // Construtor
    public Aluno(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    // Método getter
    public String recuperarNaturalidade() {
        return naturalidade;
    }

    // Sobrescrita do método equals para comparar Alunos pelo nome e naturalidade
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(naturalidade, aluno.naturalidade);
    }

    // Sobrescrita do método hashCode para gerar o hash baseado no nome e naturalidade
    @Override
    public int hashCode() {
        return Objects.hash(nome, naturalidade);
    }

    // Método toString para formatar a saída
    @Override
    public String toString() {
        return String.format("%s (%s)", nome, naturalidade);
    }
}
