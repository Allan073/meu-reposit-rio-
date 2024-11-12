public class Cachorrao extends Cachorro {

    public Cachorrao(String n){
        super.nome = n;
    }
   
    public String getNome(){
        return super.nome;
    }
    
    @Override
     public void fazerSom(){
        System.out.println("AU AU");
        System.out.println("AU AU AU");
    }
}
