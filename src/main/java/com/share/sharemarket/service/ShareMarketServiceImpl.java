package com.share.sharemarket.service;

import com.share.sharemarket.model.ShareMarket;
import com.share.sharemarket.repo.ShareMarketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShareMarketServiceImpl implements ShareMarketService{

    @Autowired
    private ShareMarketRepo shareMarketRepo;

    @Override
    public List<ShareMarket> getAllShares() {
        return (ArrayList<ShareMarket>) shareMarketRepo.findAll();
    }
}
