package JavaTutorialOOPS;

public class OOPS_25_Finally {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        while(true){
            try{
                int c = a / b;
                System.out.println("c = " + c);
            }catch(Exception e){
                System.out.println(e);
                break;
            }finally{
                System.out.println("I am finally block");
            }
            b--;
        }
    }
}
