
package com.example.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Word {
    @Id
    private Long id;
    private String word;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getWord() { return word; }
    public void setWord(String word) { this.word = word; }
}
