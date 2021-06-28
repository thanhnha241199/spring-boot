package com.techgeeknext.repository;

import com.techgeeknext.model.like.LikeDao;
import org.springframework.data.repository.CrudRepository;

public interface LikeRepository extends CrudRepository<LikeDao, Integer> {
}
