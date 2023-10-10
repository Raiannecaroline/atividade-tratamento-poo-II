import java.util.Arrays;

public class CorpoDocente {

    private String[] nome;
    private String[] idade;
    private String[] sexo;
    private String[] cpf;
    private String[] rg;
    private String[] endereco;

    public CorpoDocente(String[] nome, String[] idade, String[] sexo,
                        String[] cpf, String[] rg, String[] endereco) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public String[] getIdade() {
        return idade;
    }

    public void setIdade(String[] idade) {
        this.idade = idade;
    }

    public String[] getSexo() {
        return sexo;
    }

    public void setSexo(String[] sexo) {
        this.sexo = sexo;
    }

    public String[] getCpf() {
        return cpf;
    }

    public void setCpf(String[] cpf) {
        this.cpf = cpf;
    }

    public String[] getRg() {
        return rg;
    }

    public void setRg(String[] rg) {
        this.rg = rg;
    }

    public String[] getEndereco() {
        return endereco;
    }

    public void setEndereco(String[] endereco) {
        this.endereco = endereco;
    }

    public void listarProfessores() {
        System.out.println("Nome: " + Arrays.toString(this.nome));
        System.out.println("Idade: " + Arrays.toString(this.idade));
        System.out.println("Sexo: " + Arrays.toString(this.sexo));
        System.out.println("CPF: " + Arrays.toString(this.cpf));
        System.out.println("RG: " + Arrays.toString(this.rg));
        System.out.println("Endereço: " + Arrays.toString(this.endereco));
    }
}
