package PracticeHackerrank;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int largestPrime = getLargestPrime(217);
        System.out.println(largestPrime);
    }

    public static int getLargestPrime(int number){
        if(number <= 0){
            return -1;
        }

        ArrayList<Integer> myList = new ArrayList<Integer>();

        for(int i = 1;i <= number;i++){
            if(number % i == 0 && isPrime(i)){
                myList.add(i);
            }
        }

        return myList.get(myList.size() - 1);

    }

    public static boolean isPrime(int number){
        if(number == 1){
            return false;
        }
        for(int i = 2;i <= (long)Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
