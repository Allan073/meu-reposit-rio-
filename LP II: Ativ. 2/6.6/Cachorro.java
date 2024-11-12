public class Cachorro extends Animal {

    public Cachorro(String n){
        super.nome = n;
    }

    public Cachorro(){
        super.nome = "não definido";
    }

    public String getNome(){
        return this.nome;
    }
    
    @Override
     public void fazerSom(){
        System.out.println("au au");
        System.out.println("au au au");
    }
    
}
