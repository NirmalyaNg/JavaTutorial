package JavaTutorialBasics;

public class MethodOverloading {
    static void greet(){
        System.out.println("Hello World !");
    }
    static void greet(String name){
        System.out.println("Hello " + name);
    }
    static void greet(String name,String message){
        System.out.println(message + " " + name);
    }

    public static void main(String[] args) {
        greet();
        greet("Nirmalya");
        greet("Sampriti","Good Night !");
    }
}
