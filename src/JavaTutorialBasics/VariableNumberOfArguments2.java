package JavaTutorialBasics;

public class VariableNumberOfArguments2 {
    static int getSum(int num,int ...args){
        // Here num is a compulsory argument
        // All the other arguments will be stored in array arr
        int sum = num;
        for(int n:args){
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getSum(10));
        System.out.println(getSum(20,30));
        System.out.println(getSum(15,20,30,40,50,60));
    }
}
