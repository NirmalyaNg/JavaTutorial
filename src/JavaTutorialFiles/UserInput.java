package JavaTutorialFiles;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String fullname = s.nextLine();

        System.out.println("Fullname is " + fullname);
    }
}
