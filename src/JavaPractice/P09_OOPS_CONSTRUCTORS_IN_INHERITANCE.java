package JavaPractice;

class Demo1{
    public Demo1(){
        System.out.println("Inside Demo1 class constructor");
    }
    public Demo1(int a){
        System.out.println("Inside Demo1 class constructor with a parameter " + a);
    }
    public Demo1(int a,int b){
        System.out.println("Inside Demo1 class constructor with two parameters " + a + " " + b);
    }
}

class Demo2 extends Demo1{
    public Demo2(){
        super(10);
        System.out.println("Inside Demo2 class constructor");
    }
}

public class P09_OOPS_CONSTRUCTORS_IN_INHERITANCE {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();

    }
}
