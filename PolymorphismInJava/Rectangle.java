package PolymorphismInJava;

 class Rectangle implements Shape {
     private double width;
     private double length;

     public Rectangle(double width,double length){
         this.width=width;
         this.length=length;
     }

     public double getLength() {
         return length;
     }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public void setLength(double length) {
         this.length = length;
     }

     @Override
     public double calculateArea() {
         return width*length;
     }

     @Override
     public double calculatePerimeter() {
         return 2*(width+length);
     }
 }
