package PracticeHackerrank;
import java.util.*;
import java.math.BigInteger;

public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q > 0){
            int count = 0;
            String canStore ="";
            String input = sc.next();

            try{
                byte b = Byte.parseByte(input);
                canStore += "byte ";
                count++;
            }catch(NumberFormatException en){
                BigInteger b = new BigInteger(input);
            }
            try{
                short b = Short.parseShort(input);
                canStore += "short ";
                count++;

            }catch(NumberFormatException en){
                BigInteger b = new BigInteger(input);
            }
            try{
                int b = Integer.parseInt(input);
                canStore += "int ";
                count++;

            }catch(NumberFormatException en){
                BigInteger b = new BigInteger(input);
            }
            try{
                long b = Long.parseLong(input);
                canStore += "long";
                count++;

            }catch(NumberFormatException en){
                BigInteger b = new BigInteger(input);
            }
            if(count == 0){
                System.out.printf("%s can't be fitted anywhere.\n",input);
            }else{
                System.out.printf("%s can be fitted in:\n",input);
                String [] arr = canStore.split(" ");
                for(String s:arr){
                    System.out.println("* " + s);
                }
            }



            q--;
        }
    }
}