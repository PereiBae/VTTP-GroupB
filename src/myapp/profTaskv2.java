package myapp;

import java.io.Console;
import java.lang.System;

public class profTaskv2{

    public static void main (String[] args){
        float acc = 0;
        boolean stop = false;
        Console cons = System.console();
        while (!stop){
            
            //Read a line and trim it
            String cmd = cons.readLine("CMD>").trim();

            switch (cmd) {
                case "INIT":
                acc = 0;
                break;
                case "BRK":
                stop = true;
                break;
                case "SHOW":
                System.out.printf("> %3f\n" ,acc);
                break;
                // ADD 5 6 7 9
                case "ADD 5 6 7 9":
                cmd = cons.readLine("VAL>").strip(" ");
                Float value = Float.parseFloat(cmd);
                acc += value;
                break;
                // SUB 5 6 7 9
                case "SUBTRACT":
                cmd = cons.readLine("VAL>").trim();
                value = Float.parseFloat(cmd);
                acc -= value;
                break;
                // MUL 5 6 7 9
                case "MUL":
                cmd = cons.readLine("VAL>").trim();
                value = Float.parseFloat(cmd);
                acc *= value;
                break;
                // DIV 4
                case "DIV":
                cmd = cons.readLine("VAL>").trim();
                value = Float.parseFloat(cmd);
                acc /= value;
                break;
            }
        }
    }
}