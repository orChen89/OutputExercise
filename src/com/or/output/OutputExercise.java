package com.or.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputExercise {

    public static void main(String[] args) {

        String [] titles = {"The Matrix", "Quantum world", "Expensive Fox", "The Batman"};
        float [] prices = {80.0f, 75.5f, 102.9f,  95.5f};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Titles_With_Prices.txt"));
            for (int i = 0; i < titles.length ; i++) {
                writer.write(titles[i] + " - "  + prices[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
