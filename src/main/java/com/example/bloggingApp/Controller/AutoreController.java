package com.example.bloggingApp.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AutoreController {

    @GetMapping
    @RequestMapping ("/listaAutori")
    public String getAll(){
        return "funziona";
    }

    @GetMapping
    @RequestMapping("/autore")
    public String getById(){
        return "funziona";

    }

    @PostMapping
    @RequestMapping("/createAutore")
    public String createNewPost(){
        return "funziona";

    }

    @PutMapping
    @RequestMapping("/editAutore")
    public String editPost(){
        return "funziona";

    }
    @DeleteMapping
    @RequestMapping("/delete")
    public String deletePost(){
        return "funziona";
    }

}
