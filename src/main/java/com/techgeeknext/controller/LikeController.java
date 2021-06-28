package com.techgeeknext.controller;


import com.techgeeknext.model.like.LikeDao;
import com.techgeeknext.model.post.PostDao;
import com.techgeeknext.service.LikeService;
import com.techgeeknext.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    LikeService likeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<LikeDao> list() {
        return likeService.likeDaoList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<LikeDao> get(@PathVariable Integer id) {
        try {
            LikeDao likeDao = likeService.getLikeDao(id);
            return new ResponseEntity<LikeDao>(likeDao, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<LikeDao>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void add(@RequestBody LikeDao likeDao) {
        likeService.saveLikeDao(likeDao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody LikeDao likeDao, @PathVariable Integer id) {
        try {
            likeDao.setId(id);
            likeService.saveLikeDao(likeDao);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        likeService.deleteLikeDao(id);
    }
}
