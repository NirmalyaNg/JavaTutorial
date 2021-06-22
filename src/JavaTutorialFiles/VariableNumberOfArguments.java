package JavaTutorialFiles;

public class VariableNumberOfArguments {
    static int findSum(int ...args){
        // Here all the arguments are available in the array arr
        int sum = 0;
        for(int n : args){
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum1 = findSum();
        int sum2 = findSum(10,20);
        int sum3 = findSum(10,20,30);
        int sum4 = findSum(10,20,30,40,50,60);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
