package JavaPractice;

class MotuFather{
    int motuProperty = 5000000;
}

class MiniMotu1 extends MotuFather{
    void display1(){
        System.out.println("Heyyy I am mini motu 1");
    }
}

class MiniMotu2 extends MotuFather{
    void display2(){
        System.out.println("Heyyy I am mini motu 2");
    }
}

public class P07_OOPS_INHERITANCE_HIERARCHIAL {
    public static void main(String[] args) {
        MiniMotu1 m1 = new MiniMotu1();
        MiniMotu2 m2 = new MiniMotu2();

        System.out.println(m1.motuProperty);
        System.out.println(m2.motuProperty);
        m1.display1();
        m2.display2();
    }
}
