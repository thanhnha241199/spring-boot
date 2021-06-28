package com.techgeeknext.repository;

import com.techgeeknext.model.post.PostDao;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostDao, Integer> {
    PostDao findById(int id);
}
