package com.intern.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class Capitalization {

    private static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"
        char[] text = input.toCharArray();

        text[0] = Character.toUpperCase(text[0]);

        for(int i=1; i<text.length; i++){
            if(text[i] == ' '){
                text[i+1] = Character.toUpperCase(text[i+1]);
            }
            else{
                if(text[i-1] != ' '){
                    text[i] = Character.toLowerCase(text[i]);
                }
            }
        }

        String output = new String(text);
        return output;
    }

    public static Map<String, List<String>> convertToMap (List<Book> books) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>

        for(Book book: books){
            book.setAuthor(Capitalization.capitalize(book.getAuthor()));
            book.setTitle(Capitalization.capitalize(book.getTitle()));
        }

        return books.stream().collect(Collectors.groupingBy(
            book ->book.getAuthor(), Collectors.mapping(Book::getTitle, Collectors.toList())
        ));
    }
}
