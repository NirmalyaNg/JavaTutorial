package JavaTutorialOOPS;
class Demo1{
    public void greet(){
        System.out.println("Good Morning !");
    }

    public void greet(String message){
        System.out.println(message);
    }
    public void display(){
        System.out.println("Display of class Demo1");
    }
}

class Demo2 extends Demo1{
    @Override
    public void display(){
        System.out.println("Display of class Demo2");
    }
}



public class StaticVsDynamicBinding {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.greet();
        d1.greet("Good Night");
    }
}

/*
1. Binding can be defined as linking between method call and method definition.
2. Binding can be of two types a) Static Binding  b)  Dynamic Binding.

Static Binding :-
1. Binding which can be resolved during compile time by the compiler.
2. Also called Early Binding.
3. Binding happens before a program actually runs.
4. Example :- Method Overloading.

Dynamic Binding :-
1. Binding which cannot be resolved during compile time by the compiler;
2. Also called Late Binding.
3. Binding happens during runtime.
4. Example :- Method Overriding.

Static vs Dynamic Binding

1. Static binding uses Type information for binding while Dynamic binding uses Objects to resolve Binding.
2. Binding of all static,final and private methods is done at compile time.
3. Overloaded methods are resolved during compile time using static binding while overridden methods
   are resolved using dynamic binding during runtime.
 */