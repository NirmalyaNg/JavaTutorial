package JavaTutorialOOPS;
class A{
    A(){
        System.out.println("Inside Constructor of Class A");
    }

    A(int x){
        System.out.println("Inside overloaded constructor of class A with parameter " + x);
    }
}
class B extends A{
    B(){
        System.out.println("Inside Constructor of Class B");
    }

    B(int x,int y){
        super(x);
        System.out.println("Inside overloaded constructor of class B with parameter " + y);
    }
}
class C extends B{
    C(){
        System.out.println("Inside Constructor of Class C");
    }

    C(int x,int y,int z){
        super(x,y);
        System.out.println("Inside overloaded constructor of class C with parameter " + z);
    }
}

public class ConstructorOverloadingInInheritance {
    public static void main(String[] args) {
        // B b = new B();
        // B b = new B(10,20);
        C c = new C(10,20,30);
    }
}
