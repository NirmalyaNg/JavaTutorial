package JavaPractice;

class SumClass{
    public void addNumbers(int a,int b){
        System.out.println("The sum is : " + (a + b));
    }
    public void addNumbers(int a,int b,int c){
        System.out.println("The sum is : " + (a + b + c));
    }
    public void addNumbers(float a,float b){
        System.out.println("The sum is : " + (a + b));
    }
}

public class P03_OOPS_OVERLOADING {
    public static void main(String[] args) {
        SumClass sc = new SumClass();

        sc.addNumbers(10,20);
        sc.addNumbers(10,20,30);
        sc.addNumbers(3.2f,3.8f);
    }
}
