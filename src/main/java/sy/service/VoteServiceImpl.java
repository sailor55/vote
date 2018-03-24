/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.VoteMapper;
import sy.model.Vote;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-03-24 14:34
 */
@Service("voteService")
public class VoteServiceImpl implements VoteServiceI {

    private VoteMapper voteMapper;

    public VoteMapper getVoteMapper() {
        return voteMapper;
    }

    @Autowired
    public void setVoteMapper(VoteMapper voteMapper) {
        this.voteMapper = voteMapper;
    }

    public List<Vote> getAllVoteResult() {
        return voteMapper.selectAll();
    }

    public void add(Vote vote) {
        voteMapper.insert(vote);
    }
}
