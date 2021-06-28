package com.techgeeknext.repository;

import com.techgeeknext.model.share.ShareDao;
import org.springframework.data.repository.CrudRepository;

public interface ShareRepository extends CrudRepository<ShareDao, Integer> {
}