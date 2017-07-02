package io.github.vkb24312.asciiCoder;

import java.util.Scanner;

public class Terminal {
    public static void run(String[] args){
        System.out.println("You have run this in terminal mode");
        System.out.println("To run this in graphical mode, run it as java -jar <jarfile>");
        System.out.println("Please enter the message you want to code");
        Scanner s = new Scanner(System.in);
        s.useDelimiter("hihiasdjfadsuif");
        String input = s.nextLine();

        System.out.println("Are you coding this or decoding this? (c/d)");
        boolean isCoding = !new Scanner(System.in).useDelimiter("hihiasdjfadsuif").nextLine().toLowerCase().startsWith("d");

        System.out.println("Please enter the password used");
        String password = new Scanner(System.in).useDelimiter("hihiasdfasdfefeea").nextLine();

        boolean hasError = false;

        if(!hasError) {
            String output = Code.code(input, password, isCoding);
            if(isCoding) {
                System.out.println("Your coded message is: " + output);
            } else {
                System.out.println("Your decoded message is: " + output);
            }
        }
        System.out.println("Press enter to try again");
        s.nextLine();
        System.out.print("\n");
        run(args);
    }
}