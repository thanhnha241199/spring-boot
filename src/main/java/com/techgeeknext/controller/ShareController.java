package com.techgeeknext.controller;

import com.techgeeknext.model.share.ShareDao;
import com.techgeeknext.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/share")
public class ShareController {
    @Autowired
    ShareService shareService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ShareDao> list() {
        return shareService.shareDaoList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ShareDao> get(@PathVariable Integer id) {
        try {
            ShareDao shareDao = shareService.getShareDao(id);
            return new ResponseEntity<ShareDao>(shareDao, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<ShareDao>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void add(@RequestBody ShareDao postDao) {
        shareService.saveShareDao(postDao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody ShareDao shareDao, @PathVariable Integer id) {
        try {
            shareDao.setId(id);
            shareService.saveShareDao(shareDao);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        shareService.deleteShareDao(id);
    }
}
