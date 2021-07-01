package PracticeHackerrank;
public class Udemy_NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);

    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        if(number == 0){
            System.out.println("Zero");
            return;
        }

        int reversed_number = reverse(number),i;
        int count_original = getDigitCount(number);
        int count_reversed = getDigitCount(reversed_number);
        int diff = count_original - count_reversed;



        int temp = reversed_number;
        int rem;
        while(temp != 0){
            rem = temp % 10;
            String word = "";
            switch(rem){
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
            }
            System.out.println(word);
            temp = temp / 10;
        }
        for(i=1;i<=diff;i++){
            System.out.println("Zero");
        }
    }

    public static int reverse(int number){
        int temp = number;
        int rem,res = 0;
        while(temp != 0){
            rem = temp % 10;
            res = res * 10 + rem;
            temp = temp / 10;
        }
        return res;

    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count = 0,temp = number;
        while(temp != 0){
            count++;
            temp = temp / 10;
        }
        return count;
    }
}