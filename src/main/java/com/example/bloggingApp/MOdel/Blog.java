package com.example.bloggingApp.MOdel;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Blog {

    private List<Post> posts= new ArrayList<>();
    private List<Autore> autori= new ArrayList<>();

    public Blog() {
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public void setAutori(List<Autore> autori) {
        this.autori = autori;
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public void addAutore(Autore autore){
        autori.add(autore);
    }

    public List<Post> getAll(){
        return posts;
    }
    public List<Autore> getAllAutori(){
        return autori;
    }


    public Post getPostById(long id){


        for (int i = 0; i <posts.size() ; i++) {
            if(id==posts.get(i).getId()){
                return posts.get(i);
            }

        }
        throw new RuntimeException("Post non presente");
    }

    public Autore getAutoreById(long id){
        for (int i = 0; i <autori.size() ; i++) {

            if(id==autori.get(i).getId()){
                return autori.get(i);
            }

        }
        throw new RuntimeException("Post non presente");
    }
}
