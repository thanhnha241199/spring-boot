package com.techgeeknext.repository;

import com.techgeeknext.model.comment.CommentDao;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<CommentDao, Integer> {
}