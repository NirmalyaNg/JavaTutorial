package JavaTutorialOOPS;

class Base{
    public int x;

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }
}


public class OOPS_06_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();

        // Set attribute inherited from Base class
        d.setX(10);
        System.out.println("X = " + d.getX());

        d.setY(20);
        System.out.println("Y = " + d.getY());
    }
}
