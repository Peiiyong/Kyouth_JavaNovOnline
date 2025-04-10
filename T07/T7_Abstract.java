package T07;
abstract class Shape{
    abstract void draw();

    void description(){
        System.out.println("The shape is drawn.");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}
public class T7_Abstract {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        shape1.description();

        System.out.println("========================");
    
        Shape shape2 = new Rectangle();
        shape2.draw();
        shape2.description();
    }
}