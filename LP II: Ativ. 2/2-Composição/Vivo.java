class Vivo{
   private Coracao coracao;

   public Vivo(){
    this.coracao = new Coracao();
   }

   public void batimentoCoracao(){
      coracao.batimento();
      System.out.println("o ser está vivo.");
   }
}
    