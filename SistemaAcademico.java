import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico {

    private final List<CorpoDocente> corpoDocente = new ArrayList<>();
    private final List<String> mensagensErro = new ArrayList<>();

    public void incluirProfessor(String nome, int idade, String sexo, String cpf, String rg, String endereco) {
        if (corpoDocente.size() >= 20) {
            mensagensErro.add("Erro: Limite máximo de professores atingido.");
            throw new RuntimeException("Erro: Limite máximo de professores atingido.");
        }

        for (CorpoDocente docentes : corpoDocente) {
            if (docentes.getCpf().equals(cpf)) {
                mensagensErro.add("Erro: Professor com CPF já existe no sistema.");
                throw new RuntimeException("Erro: Professor com CPF já existe no sistema.");
            }
        }

        corpoDocente.add(new CorpoDocente(nome, idade, sexo, cpf, rg, endereco));
    }

    public void excluirProfessor(String cpf) {
        for (CorpoDocente docentes : corpoDocente) {
            if (docentes.getCpf().equals(cpf)) {
                corpoDocente.remove(docentes);
                return;
            }
        }

        mensagensErro.add("Erro: Professor com CPF não encontrado no sistema.");
        throw new RuntimeException("Erro: Professor com CPF não encontrado no sistema.");
    }

    public CorpoDocente pesquisarProfessor(String cpf) {
        for (CorpoDocente docentes : corpoDocente) {
            if (docentes.getCpf().equals(cpf)) {
                return docentes;
            }
        }

        mensagensErro.add("Erro: Professor com CPF não encontrado no sistema.");
        throw new RuntimeException("Erro: Professor com CPF não encontrado no sistema.");
    }

    public List<String> getMensagensErro() {
        return mensagensErro;
    }

}
