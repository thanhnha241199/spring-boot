package com.techgeeknext.service;

import com.techgeeknext.model.comment.CommentDao;
import com.techgeeknext.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public List<CommentDao> commentDaoList() {
        return (List<CommentDao>) commentRepository.findAll();
    }

    public void saveCommentDao(CommentDao commentDao) {
        commentRepository.save(commentDao);
    }

    public CommentDao getCommentDao(Integer id) {
        return commentRepository.findById(id).get();
    }

    public void deleteCommentDao(Integer id) {
        commentRepository.deleteById(id);
    }
}