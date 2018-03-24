/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package sy.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sy.model.Vote;
import sy.model.VoteDo;
import sy.service.VoteServiceI;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-03-24 14:40
 */
@Controller
@RequestMapping(value = "/vote")
public class VoteController {

    private VoteServiceI voteService;

    public VoteServiceI getVoteService() {
        return voteService;
    }

    @Autowired
    public void setVoteService(VoteServiceI voteService) {
        this.voteService = voteService;
    }

    //投票
    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String vote(@ModelAttribute VoteDo voteDo, HttpServletRequest request) throws ParseException {
        System.out.println("vote");
        Vote vote = new Vote();
        vote.setCreateTime(new Date());
        vote.setUserName(voteDo.getUserName());
        vote.setFightTime(voteDo.getFightTime());
        voteService.add(vote);
        return "redirect:/vote/tovote.json";
    }

    @RequestMapping(value = "/listall", method = RequestMethod.GET)
    public String listall(HttpServletRequest request) {
        List<Vote> list = voteService.getAllVoteResult();
        request.setAttribute("voteList", list);
        return "vote";
    }

    @RequestMapping(value = "tovote", method = RequestMethod.GET)
    public String toRegister(HttpServletRequest request) {
        System.out.println("toVote");
        List<Vote> list = voteService.getAllVoteResult();
        request.setAttribute("voteList", list);
        return "vote";
    }

}
