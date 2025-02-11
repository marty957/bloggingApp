package com.example.bloggingApp.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogPosts")
public class PostController {


    @GetMapping
    @RequestMapping ("/listaPosts")
    public void getAll(){

    }

    @GetMapping
    @RequestMapping("/singlePost")
    public void getById(){

    }

    @PostMapping
    @RequestMapping("/create")
    public void createNewPost(){

    }

    @PutMapping
    @RequestMapping("/editPost")
    public void editPost(){

    }
    @DeleteMapping
    @RequestMapping("/delete")
    public void deletePost(){

    }


}
