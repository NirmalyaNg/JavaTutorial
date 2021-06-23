package JavaTutorialBasics;

public class StringMethods {
    public static void main(String[] args) {
        String full_name = "Nirmalya Ganguly";

        // Strings are immutable

        // Lowercase
        String upper_case_name = full_name.toLowerCase();

        // Uppercase
        String lower_case_name = full_name.toUpperCase();

        System.out.println(upper_case_name);
        System.out.println(lower_case_name);

        // Substring with 1 argument
        String surname = full_name.substring(9);
        System.out.println(surname);

        // Substring with 2 arguments --> start , end - 1
        String surname_short = full_name.substring(9,13);
        System.out.println(surname_short);

        // Trim
        String space_string = "      Heloooo   ";
        System.out.println(space_string.strip());

        // Replace  old character with new character
        String old_string = "Happy";
        String new_string = old_string.replace('p','m');
        System.out.println(new_string);

        // Replace new substring with new substring
        String old_string1 = "Niru";
        String new_string1 = old_string1.replace("ru","mu");
        System.out.println(new_string1);

        // startswith and endswith
        String name = "nirmalya";
        System.out.println(name.startsWith("nir"));
        System.out.println(name.endsWith("lyaa"));

        // indexof
        String organization = "Accenture";
        System.out.println(organization.indexOf('t'));
        System.out.println(organization.indexOf("ure"));
        System.out.println(organization.indexOf('e',5));

        // equals

        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));

        // equals Ignore Case

        String s3 = "nirmalya";
        String s4 = "NIRMALYA";

        System.out.println(s3.equalsIgnoreCase(s4));

    }
}
