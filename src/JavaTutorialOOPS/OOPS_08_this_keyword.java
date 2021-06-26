package JavaTutorialOOPS;
class MyClass{
    int a;
    int b;

    MyClass(int a,int b){
        this.a = a;
        this.b = b;
    }
}


class Utility{
    static void printObjDetails(MyClass obj){
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}


public class OOPS_08_this_keyword {
    public static void main(String[] args) {
        MyClass m = new MyClass(10,20);
        Utility.printObjDetails(m);
    }
}
