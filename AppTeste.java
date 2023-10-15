import java.util.List;

public class AppTeste {

    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();
        String cpfParaPesquisar = "12345678901";
        CorpoDocente professorEncontrado = sistema.pesquisarProfessor(cpfParaPesquisar);

        try {
            sistema.incluirProfessor("Professor1", 35, "M", "12345678901", "1234", "Endereço1");
            sistema.incluirProfessor("Professor2", 40, "F", "98765432109", "5678", "Endereço2");


            sistema.incluirProfessor("Professor1", 30, "M", "12345678901", "4321", "Endereço3");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {

            sistema.excluirProfessor("99999999999");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        List<String> mensagensErro = sistema.getMensagensErro();
        for (String mensagem : mensagensErro) {
            System.out.println(mensagem);
        }


        if (professorEncontrado != null) {
            System.out.println("Professor encontrado: " + professorEncontrado.getNome());
        } else {
            System.out.println("Professor com CPF " + cpfParaPesquisar + " não encontrado.");
        }


    }


}
