package com.techgeeknext.service;

import com.techgeeknext.model.like.LikeDao;
import com.techgeeknext.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;
    public List<LikeDao> likeDaoList() {
        return (List<LikeDao>) likeRepository.findAll();
    }

    public void saveLikeDao(LikeDao likeDao) {
        likeRepository.save(likeDao);
    }

    public LikeDao getLikeDao(Integer id) {
        return likeRepository.findById(id).get();
    }

    public void deleteLikeDao(Integer id) {
        likeRepository.deleteById(id);
    }
}