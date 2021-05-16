package com.jy.user.service;

import com.jy.user.dao.UserDAOImpl;
import com.jy.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAOImpl dao;

    public List<UserVO> selUser() {
        return dao.selUser();
    }

}
