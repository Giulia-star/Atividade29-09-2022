

public class TesteHeranca1{
    public static void main(String[] arg){
        //vejamos se aluno de graduacao tem nome e idade
        //construtor que nao recebe coisa alguma chama: construtor padrao
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome="Joao";
       aluno.idade= 17;
        System.out.printf("Nome: %s, idade: %d\n",aluno.nome, aluno.idade);
    }
}