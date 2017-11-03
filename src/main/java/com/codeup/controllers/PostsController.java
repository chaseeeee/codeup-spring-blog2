package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller

public class PostsController {

  @ResponseBody
  @GetMapping("/posts")
  public String viewPost(){
    return "Viewing all posts";
  }
  @ResponseBody
  @GetMapping("/posts/{ID}")
  public String viewPost(@PathVariable long ID){
    return "Viewing this post: " + ID;
  }
  @ResponseBody
  @GetMapping("/posts/create")
  public String writePost(){
    return "Create a new post:";
  }
  @ResponseBody
  @PostMapping("/posts/create")
    public String generatePost(){
    return "Generating blog post...";
  }


}
