public class Cylinder{  
   private double height; 
   private Circle base; 
   
   public Cylinder() {  
      base = new Circle(); 
      height = 1.0; 
   }
   
   public Cylinder(double height) {
      base = new Circle();  
      this.height = height;
   }
   
   public Cylinder(double radius, double height) {
      base = new Circle(radius);
      this.height = height;
   }
   
   public double getHeight() {
      return this.height; 
   }
  
   public double getVolume() {
      return base.getArea()*height; 

   }

   public double getRadius() {
      return this.base.getRadius(); 
   }

   public double getArea() {
      return this.base.getCircumference()*height; 
   }
}