/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package sy.model;

import java.util.Date;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-03-24 16:04
 */
public class VoteDo {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 战斗时间
     */
    private String fightTime;
    /**
     * 投票时间
     */
    private Date createTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFightTime() {
        return fightTime;
    }

    public void setFightTime(String fightTime) {
        this.fightTime = fightTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
