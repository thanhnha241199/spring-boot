package com.techgeeknext.controller;


import com.techgeeknext.model.post.PostDao;
import com.techgeeknext.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<PostDao> list() {
        return postService.postDaoList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PostDao> get(@PathVariable Integer id) {
        try {
            PostDao postDao = postService.getPostDao(id);
            return new ResponseEntity<PostDao>(postDao, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<PostDao>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void add(@RequestBody PostDao postDao) {
        postService.savePost(postDao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody PostDao postDao, @PathVariable Integer id) {
        try {
            postDao.setId(id);
            postService.savePost(postDao);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        postService.deletePostDao(id);
    }
}
