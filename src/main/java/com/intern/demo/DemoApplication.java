package com.intern.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication public class DemoApplication {

    private static Map<String, List<String>> map;

    public static void main(String[] args) {

        // todo EXPECTED RESULT:
        // {Jane Stark=[Local Book 1, Local Book 2, Local Book 3, Local Book 4], John Doe=[Imported Book 1, Imported Book 2, Imported Book 3, Imported Book 4]}

        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1", "joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2", "joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3", "joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4", "joHN dOE");

        LocalBook localBook1 = new LocalBook("jaNE stARk", "loCal bOok 1", "gramEDia");
        LocalBook localBook2 = new LocalBook("jaNE stARk", "loCal bOok 2", "gramEDia");
        LocalBook localBook3 = new LocalBook("jaNE stARk", "loCal bOok 3", "gramEDia");
        LocalBook localBook4 = new LocalBook("jaNE stARk", "loCal bOok 4", "gramEDia");

        // TODO CREATE A NEW LIST OBJECT CALLED "inputs" THAT CONSIST OF ALL BOOKS STATED ABOVE

        List<Book> books = new ArrayList<Book>();
        books.add(importedBook1);
        books.add(importedBook2);
        books.add(importedBook3);
        books.add(importedBook4);
        books.add(localBook1);
        books.add(localBook2);
        books.add(localBook3);
        books.add(localBook4);

        map = Capitalization.convertToMap(books);
        System.out.println(map);

        // TODO CALL CAPITALIZATION convertToMap WITH "inputs" AS REQUEST AND PRINT IT OUT

//        SpringApplication.run(DemoApplication.class, args);
    }
}
