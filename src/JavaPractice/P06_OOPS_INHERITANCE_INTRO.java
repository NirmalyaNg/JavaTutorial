package JavaPractice;

class Human{
    int numberOfLegs = 2;
    int numberOfHands = 2;

    public void display(){
        System.out.println("I am a human !");
    }
}

class Boy extends Human {
    String gender = "Male";
}

public class P06_OOPS_INHERITANCE_INTRO {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.display();

        Boy b1 = new Boy();
        System.out.println(b1.numberOfHands);
        System.out.println(b1.numberOfLegs);
        System.out.println(b1.gender);
        b1.display();

    }
}
