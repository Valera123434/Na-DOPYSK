package org.example;

import org.example.lexer.Lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class InterpreterSpoProgram {

    private static Logger logger;

    public static void main(String[] args) throws Exception {
        String file = readFile("src/org/example/input.txt");
        Lexer lexer = new Lexer(file);
    }

    private static String readFile(String path) {
        StringBuilder data = new StringBuilder();
        if (path != null) {
            try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    data.append(line + "\n");
                }
            } catch (IOException e) {
                logger.info("Empty file!");
            }
        }
        return data.toString();
    }
}
