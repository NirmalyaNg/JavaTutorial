package JavaPractice;

class GrandFather{
    int grandProperty = 10000;
}

class Father extends GrandFather{
    int fatherProperty = 300000;
}

class MotuSon extends Father{
    int motuProperty = 3000000;
}

public class P07_OOPS_INHERITANCE_MULTILEVEL {
    public static void main(String[] args) {
        MotuSon mt = new MotuSon();
        System.out.println(mt.grandProperty);
        System.out.println(mt.fatherProperty);
        System.out.println(mt.motuProperty);
    }
}
