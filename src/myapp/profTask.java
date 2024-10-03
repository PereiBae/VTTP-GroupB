package myapp;

import java.io.Console;

public class profTask{

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
                case "ADD":
                cmd = cons.readLine("VAL>").trim();
                Float value = Float.parseFloat(cmd);
                acc += value;
                break;
                case "SUBTRACT":
                cmd = cons.readLine("VAL>").trim();
                value = Float.parseFloat(cmd);
                acc -= value;
                break;
                case "MUL":
                cmd = cons.readLine("VAL>").trim();
                value = Float.parseFloat(cmd);
                acc *= value;
                break;
                case "DIV":
                cmd = cons.readLine("VAL>").trim();
                value = Float.parseFloat(cmd);
                acc /= value;
                break;
            }
        }
    }
}