public class Retangulo extends Quadrado {
    private int base;
    
    public Retangulo(int lado, int base){
        super(lado);
    }

    public int getArea(){
        return lado*base;
    }
   
}
