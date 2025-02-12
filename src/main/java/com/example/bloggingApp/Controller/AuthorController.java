package com.example.bloggingApp.Controller;


import com.example.bloggingApp.MOdel.Author;
import com.example.bloggingApp.MOdel.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    Blog blog;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String inserisciAutore(@RequestBody Author autoreNuovo) {
        int id = blog.nuovoAutore(autoreNuovo);
        return "L'autore con identificativo " +id+ " è stato inserito con successo";
    }


    @GetMapping()
    public List<Author> vediAutori(){
        List<Author> lista = blog.vediAutori();
        if(lista.size()>=0) {
            return lista;
        }else {
            throw new RuntimeException("La lista degli autori è momentaneamente vuota");
        }
    }

    @GetMapping("/{id}")
    public Author recuperaAutore(@PathVariable int id) {
        return blog.recuperaAutore(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String modificaAutore(@RequestBody Author autoreModificato, @PathVariable int id) {
        if(blog.modificaAutore(autoreModificato, id)) {
            return "Modifica avvenuta con successo";
        }else {
            return "Impossibile effettuare la modifica. Autore non presente nel sistema";
        }

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String cancellaAutore(@PathVariable int id) {
        return blog.cancellaPost(id);
    }



}
