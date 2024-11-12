public class ShowUF {
    public static void main(String[] args) {
        Curso cur = new Curso("BTI","IMD");
        Universitario sofredor = new Universitario("Aurelio", 20, cur);
        
        sofredor.mostrarUniversitario();
    }
    
}
