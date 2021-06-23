package JavaTutorialOOPS;

class Rectangle{
    int length;
    int breadth;

    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }

    public void setLength(int l){
        this.length = l;
    }

    public void setBreadth(int b){
        this.breadth = b;
    }

    public int getArea(){
        return this.length * this.breadth;
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.setLength(10);
        r1.setBreadth(20);

        System.out.println("Length : " + r1.getLength());
        System.out.println("Breadth : " + r1.getBreadth());
        System.out.println("Area : " + r1.getArea());

    }
}
