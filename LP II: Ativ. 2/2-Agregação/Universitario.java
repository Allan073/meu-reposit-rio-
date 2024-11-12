public class Universitario {
    private String nome;
    private int idade;
    private Curso curso;

    public Universitario(String n, int i, Curso c){
        this.nome = n;
        this.idade = i;
        this.curso = c;
    }

    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public void mostrarUniversitario(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        curso.mostrarCurso();
    }
    
}
