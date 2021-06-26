package JavaTutorialOOPS;
class Area{
    public void calculateArea(int side){
        System.out.println("The area is : " + (side * side));
    }

    public void calculateArea(int length,int breadth){
        System.out.println("The area is : " + (length * breadth));
    }
}

public class OOPS_11_StaticBinding_MethodOverloading {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.calculateArea(10);
        a1.calculateArea(10,20);
    }
}

/*  This is an example of Static binding.
    Here the linking between method call and method definition is resolved during compile time.
    This is determined by the compiler according to the reference type of the object
    that is invoking the method (In this case a1 is of Area type);

    The compiler will bind a1.calculateArea(10) and a1.calculateArea(10,20) to their respective
    method definitions during compile time.
 */
