package io.github.vkb24312.asciiCoder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphical {
    public static void run(String[] args){
        System.out.println("You have run this in graphical mode");
        System.out.println("To run this in terminal mode, run it as java -jar <jarfile> terminal");
        MainFrame frame = new MainFrame();
        while(true) {
            frame.button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.output.setText("Processing...");
                    String input = frame.input.getText();
                    boolean hasError = false;

                    if (!hasError) {
                        String output = Code.code(input, new String(frame.password.getPassword()), frame.normalMessage.isSelected()).toString();
                        frame.output.setText(output);
                    }
                }
            });
        }
    }
}