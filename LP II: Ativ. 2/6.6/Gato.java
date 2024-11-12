class Gato extends Animal { 

    public Gato(){}

    public Gato(String n){
        super.nome = n;
    }

    public String getNome(){
        return this.nome;
    }
    
    @Override
     public void fazerSom(){
        System.out.println("miau");
    }
}