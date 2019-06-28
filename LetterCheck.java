package lettercheck;

import java.util.Scanner;

public class LetterCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: \t");
        char letter = input.next().charAt(0);

        if (Character.isAlphabetic(letter)) {

            switch (Character.toLowerCase(letter)) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.printf("%c is a vowel letter!", letter);
                    break;

                default:
                    System.out.printf("%c is a consonant letter!", letter);

            }

            if (Character.isLowerCase(letter)) {
                System.out.printf("\n%c is a lowecase letter!", letter);
            } else {
                System.out.printf("\n%c is an uppercase letter!", letter);
            }
            System.out.printf("\n%c alphabetical order: %d", letter, Character.toLowerCase(letter) - 'a' + 1);
            
//            It can be also replaced with the previous statement. '`' is the prior letter in Unicode list.
//            System.out.printf("\n%c order: %d", letter, Character.toLowerCase(letter) - '`');

        } else if (Character.isDigit(letter)) {
            System.out.printf("%c is a digit!", letter);

        } else {
            System.out.printf("%c is an invalid input!", letter);
        }
        System.out.println("\n");

    }

}
