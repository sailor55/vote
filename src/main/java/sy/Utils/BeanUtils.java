/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package sy.Utils;

import java.lang.reflect.Field;

import sy.model.Vote;

/**
 * @author linjp
 * @version V1.0
 * @since 2018-04-02 23:43
 */
public class BeanUtils {
    public static void main(String[] args) {
        change(Vote.class, "vote", "voteDo");
    }

    public static void change(Class c, String s1, String s2) {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(
                s1 + ".set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1) + "(" + s2
                    + ".get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1) + "());");

        }
    }
}
