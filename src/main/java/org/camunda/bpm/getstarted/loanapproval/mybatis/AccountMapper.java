package org.camunda.bpm.getstarted.loanapproval.mybatis;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * Project: zhcore
 * @Comments 账号mapper
 * @Author Nian Guowei
 * @Created Date 2017/4/24
 */


@Repository
@Mapper
public interface AccountMapper {

    /**
     * 删除用户信息
     * @param username
     * @return
     */
    String getMain(String username);

}
