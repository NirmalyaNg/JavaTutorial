package JavaPractice;
// Multilevel Inheritance

class A{
    private int a;
    private int b;

    // Getters
    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    // Setters
    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }
}

class B extends A{
    int c = 5;
}

public class P07_OOPS_INHERITANCE_SINGLE {
    public static void main(String[] args) {
        B b1 = new B();
        b1.setA(10);
        b1.setB(20);
        System.out.println(b1.getA());
        System.out.println(b1.getB());
        System.out.println(b1.c);
    }
}
