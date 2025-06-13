
package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WordController {

    @Autowired
    private WordRepository repo;

    @GetMapping("/word")
    public Word getWord() {
        return repo.findById(1L).orElseThrow();
    }

    @PutMapping("/word")
    public Word updateWord(@RequestBody Word newWord) {
        Word word = repo.findById(1L).orElseThrow();
        word.setWord(newWord.getWord());
        return repo.save(word);
    }
}
