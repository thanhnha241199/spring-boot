package com.techgeeknext.repository;
import com.techgeeknext.model.user.UserDao;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}