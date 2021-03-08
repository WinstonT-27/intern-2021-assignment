package com.intern.demo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ImportedBook extends Book{

    private String translator;

    public ImportedBook(String author, String title, String translator) {
        this.author = author;
        this.title = title;
        this.translator = translator;
    }
}
