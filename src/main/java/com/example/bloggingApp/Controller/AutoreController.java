package com.example.bloggingApp.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AutoreController {

    @GetMapping
    @RequestMapping ("/listaAutori")
    public void getAll(){

    }

    @GetMapping
    @RequestMapping("/autore")
    public void getById(){

    }

    @PostMapping
    @RequestMapping("/createAutore")
    public void createNewPost(){

    }

    @PutMapping
    @RequestMapping("/editAutore")
    public void editPost(){

    }
    @DeleteMapping
    @RequestMapping("/delete")
    public void deletePost(){

    }

}
