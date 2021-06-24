package JavaTutorialOOPS;
class Base1{
    int a;
    int b;

    Base1(int a,int b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }
}

class Derived1 extends Base1{
    int c;

    Derived1(int a,int b,int c){
        super(a,b); // Here super keyword is used to call parent class constructor
        this.c = c;
    }

    void displayChild(){
        super.display(); // Here super keyword is used to call parent class method
        System.out.println("c = " + this.c);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1(10,20,30);
        d1.displayChild();
    }
}
