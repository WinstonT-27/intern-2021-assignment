package com.intern.demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.MockitoAnnotations.initMocks;

public class CapitalizationTest {

    @InjectMocks
    private Capitalization capitalization;
    private DemoApplication demo;

    @Before
    public void setUp(){
        initMocks(this);
    }

    @Test
    public void convertToMapTest() {

        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1", "joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2", "joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3", "joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4", "joHN dOE");

        LocalBook localBook1 = new LocalBook("jaNE stARk", "loCal bOok 1", "gramEDia");
        LocalBook localBook2 = new LocalBook("jaNE stARk", "loCal bOok 2", "gramEDia");
        LocalBook localBook3 = new LocalBook("jaNE stARk", "loCal bOok 3", "gramEDia");
        LocalBook localBook4 = new LocalBook("jaNE stARk", "loCal bOok 4", "gramEDia");

        List<Book> books = new ArrayList<Book>();
        books.add(importedBook1);
        books.add(importedBook2);
        books.add(importedBook3);
        books.add(importedBook4);
        books.add(localBook1);
        books.add(localBook2);
        books.add(localBook3);
        books.add(localBook4);

        assertEquals("{Jane Stark=[Local Book 1, Local Book 2, Local Book 3, Local Book 4], John Doe=[Imported Book 1, Imported Book 2, Imported Book 3, Imported Book 4]}" , Capitalization.convertToMap(books).toString());
    }
}
