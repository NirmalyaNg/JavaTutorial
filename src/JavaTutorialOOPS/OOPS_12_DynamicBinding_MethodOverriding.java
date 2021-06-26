package JavaTutorialOOPS;
class Shape{
    public void draw(){
        System.out.println("Drawing ...");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle ...");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square ...");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle ...");
    }
}

public class OOPS_12_DynamicBinding_MethodOverriding {
    public static void main(String[] args) {
        Shape s1,s2,s3;
        s1 = new Square();
        s2 = new Rectangle();
        s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}

/*
    Here during compile time the compiler will try to find draw method in Shape class
    since s1,s2 and s3 all are references of Shape type.

    However during run time all the draw method calls will be bound to their respective definitions
    in the respective classes according to the object type.

    s1.draw() call will be bound to the draw method definition in the Square class;
    s2.draw() call will be bound to the draw method definition in the Rectangle class;
    s3.draw() call will be bound to the draw method definition in the Circle class;

    This type of binding at runtime is called Runtime Binding and this process of
    creating an object of child class and assigning it to a reference of Parent class
    is called Dynamic Method Dispatch.
 */
