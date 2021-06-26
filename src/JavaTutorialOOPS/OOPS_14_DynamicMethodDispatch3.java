package JavaTutorialOOPS;
class Bank{
    public float getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    public float getRateOfInterest(){
        return 5.3f;
    }
}

class Axis extends Bank{
    public float getRateOfInterest(){
        return 6.7f;
    }
}

class ICICI extends Bank{
    public float getRateOfInterest(){
        return 6.2f;
    }
}



public class OOPS_14_DynamicMethodDispatch3 {
    public static void main(String[] args) {
        Bank b1,b2,b3;  // Here b1 ,b2 and b3 are references of the Bank class

        b1 = new SBI();
        b2 = new Axis();
        b3 = new ICICI();

        System.out.printf("Interest of SBI %.2f\n",b1.getRateOfInterest());
        System.out.printf("Interest of Axis %.2f\n",b2.getRateOfInterest());
        System.out.printf("Interest of ICICI %.2f\n",b3.getRateOfInterest());

    }
}
