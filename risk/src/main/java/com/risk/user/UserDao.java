package com.risk.user;

import com.risk.user.User;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}