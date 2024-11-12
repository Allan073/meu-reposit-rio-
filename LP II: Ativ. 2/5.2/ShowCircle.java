public class ShowCircle {
    public static void main(String[] args) {
        Circle c = new Circle(8.0,"azul");
        double result = c.getCircumference();
        
        System.out.println(String.valueOf(result));

        System.out.println(c.toString());
    }
    
}
