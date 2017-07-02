package io.github.vkb24312.asciiCoder;

public class Main {
    public static void main(String[] args) {
        try {
            if(args[0].equals("terminal")){
                Terminal.run(args);
            } else if(args[0].equals("frametest")) {
                new MainFrame();
            } else {
                Graphical.run(args);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException ignore) {Graphical.run(args);}
    }
}