package com.techgeeknext.service;

import com.techgeeknext.model.post.PostDao;
import com.techgeeknext.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<PostDao> postDaoList() {
        return (List<PostDao>) postRepository.findAll();
    }

    public void savePost(PostDao postDao) {
        postRepository.save(postDao);
    }

    public PostDao getPostDao(Integer id) {
        return postRepository.findById(id).get();
    }

    public void deletePostDao(Integer id) {
        postRepository.deleteById(id);
    }
}