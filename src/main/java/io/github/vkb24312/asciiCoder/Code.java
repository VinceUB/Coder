package io.github.vkb24312.asciiCoder;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class Code {
    public static String code(String rawInput, String password, boolean isNewMessage){
        if(!isNewMessage) return decode(rawInput, password);
        String codedMessage = "";
        for (int i = 0; i < rawInput.getBytes().length; i++) {
            codedMessage = new StringBuilder(codedMessage).append(rawInput.getBytes()[i]).toString();
        }
        String originalPassword = password;
        password = "0";
        for (int i = 0; i < originalPassword.getBytes().length; i++) {
            password = new StringBuilder(password).append(password.getBytes()[i]).toString();
        }

        String output = (new BigInteger(password).multiply(new BigInteger(codedMessage))).toString();

        return output;
    }

    public static String decode(String rawInput, String password){
        String originalPassword = password;
        password = "0";
        for (int i = 0; i < originalPassword.getBytes().length; i++) {
            password = new StringBuilder(password).append(password.getBytes()[i]).toString();
        }
        String input = new BigInteger(rawInput).divide(new BigInteger(new String(password.getBytes()))).toString();
        if(input.length()%3!=0){
            if(input.length()%3==1){
                input = "00"+input;
            } else {
                input = "0"+input;
            }
        }
        String inputs[] = input.split("(?<=\\G.{3})");
        String output = "";
        for (int i = 0; i < inputs.length; i++) {
            byte[] f = {Byte.parseByte(inputs[i])};
            try{ output = output+new String(f, "ASCII");} catch(UnsupportedEncodingException ignore){};
        }
        return output;
    }
}