public class Dependentes extends CorpoDocente{


    private String nome;
    private String idade;
    private String sexo;


    public Dependentes(String nome, String idade, String sexo, String cpf, String rg, String endereco) {
        super(nome, idade, sexo, cpf, rg, endereco);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getIdade() {
        return idade;
    }

    @Override
    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
