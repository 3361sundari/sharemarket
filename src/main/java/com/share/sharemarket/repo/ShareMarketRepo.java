package com.share.sharemarket.repo;

import com.share.sharemarket.model.ShareMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface ShareMarketRepo extends JpaRepository<ShareMarket, Long> {
}
