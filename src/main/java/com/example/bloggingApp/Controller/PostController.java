package com.example.bloggingApp.Controller;


import com.example.bloggingApp.MOdel.Blog;
import com.example.bloggingApp.MOdel.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class PostController {
    @Autowired
    Blog blog;


    @GetMapping("/listaPosts")
    public List<Post> getAll(){
        return blog.getAll();
    }

    @GetMapping("/singlePost/{id}")
    public Post getById(@PathVariable long id){
        return blog.getPostById(id);

    }

    @PostMapping("/createPost")
    @ResponseStatus(HttpStatus.CREATED)
    public String createNewPost(@RequestBody Post p ){

/*      String post="Il post con id:" +p.getId() + " è stato creato";
        post+="Categoria: " + p.getCategoria()+"/n";
        post+="Titolo: " + p.getTitolo()+"/n";
        post+="Contenuto: " + p.getContenuto()+"/n";
        post+="Tempo di lettura in minuti: " + p.getTempoDiLettura()+"/n";
        post+="autore: "+ p.getAutore();*/

       String post=" IL post con id: " + p.getId() +"è creato "+p;

        return post;

    }

    @PutMapping("/editPost")
    public String editPost(){
        return "funziona";

    }
    @DeleteMapping("/delete")
    public String deletePost(){
        return "funziona";

    }


}
