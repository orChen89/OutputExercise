package com.or.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputExercise {

    public static void main(String[] args) {

          try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Titles_With_Prices.txt"));
            List<Book> books = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                int counter = 0;
                String bookName = "";
                char c = line.charAt(counter);
                while (c != '-') {
                    bookName += c;
                    counter++;
                    c = line.charAt(counter);
                }
                counter++;
                String price = "";
                while (counter < line.length()) {
                    c = line.charAt(counter);
                    price += c;
                    counter++;
                }
                books.add(new Book(bookName,Float.parseFloat(price)));
            }
              for (Book book : books){
                  System.out.println(book.toString());
              }
          } catch (IOException e) {
            e.printStackTrace();
        }
    }
}











