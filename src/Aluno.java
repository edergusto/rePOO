public class Aluno {
    public String nomeAluno;
    public int anoNascimento;

    public static void exibirResultado(String nome, int ano){
        int ANO_ATUAL = 2026;
        int resultado = ANO_ATUAL - ano;
        System.out.println("Nome: " + nome + ", Idade: " + resultado);
    }
}
