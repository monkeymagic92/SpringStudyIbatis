package com.jy.user.dao;

import com.jy.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    SqlMapClientTemplate sqlmap;


    public List<UserVO> selUser(UserVO vo) {

        return sqlmap.queryForList("user.selUser", vo);
    }

    public List<UserVO> userList() {
        return sqlmap.queryForList("user.userList");
    }

    @Override
    public int joinUser(UserVO vo) {
        sqlmap.insert("user.joinUser", vo);
        return 1;
    }

}
