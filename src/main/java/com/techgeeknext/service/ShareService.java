package com.techgeeknext.service;

import com.techgeeknext.model.share.ShareDao;
import com.techgeeknext.repository.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ShareService {
    @Autowired
    private ShareRepository shareRepository;
    public List<ShareDao> shareDaoList() {
        return (List<ShareDao>) shareRepository.findAll();
    }

    public void saveShareDao(ShareDao shareDao) {
        shareRepository.save(shareDao);
    }

    public ShareDao getShareDao(Integer id) {
        return shareRepository.findById(id).get();
    }

    public void deleteShareDao(Integer id) {
        shareRepository.deleteById(id);
    }
}