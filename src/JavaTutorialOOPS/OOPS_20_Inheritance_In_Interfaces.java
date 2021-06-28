package JavaTutorialOOPS;

interface ParentInterface{
    void method1();
    void method2();
}
interface ChildInterface extends ParentInterface{
    void method3();
    void method4();
}

class DemoClass implements ChildInterface{
    public void method1(){
        System.out.println("This is method1");
    }
    public void method2(){
        System.out.println("This is method2");
    }
    public void method3(){
        System.out.println("This is method3");
    }
    public void method4(){
        System.out.println("This is method4");
    }
}

public class OOPS_20_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        DemoClass d1 = new DemoClass();

        d1.method1();
        d1.method2();
        d1.method3();
        d1.method4();
    }
}
