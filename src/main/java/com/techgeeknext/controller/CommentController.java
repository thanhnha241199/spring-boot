package com.techgeeknext.controller;


import com.techgeeknext.model.comment.CommentDao;
import com.techgeeknext.model.post.PostDao;
import com.techgeeknext.service.CommentService;
import com.techgeeknext.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<CommentDao> list() {
        return commentService.commentDaoList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CommentDao> get(@PathVariable Integer id) {
        try {
            CommentDao commentDao = commentService.getCommentDao(id);
            return new ResponseEntity<CommentDao>(commentDao, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<CommentDao>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void add(@RequestBody CommentDao commentDao) {
        commentService.saveCommentDao(commentDao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody CommentDao commentDao, @PathVariable Integer id) {
        try {
            commentDao.setId(id);
            commentService.saveCommentDao(commentDao);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        commentService.deleteCommentDao(id);
    }
}
