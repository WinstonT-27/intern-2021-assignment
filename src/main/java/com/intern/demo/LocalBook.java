package com.intern.demo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LocalBook extends Book{

    private String store;

    public LocalBook(String author, String title, String store) {
        this.title = title;
        this.author = author;
        this.store = store;
    }
}
