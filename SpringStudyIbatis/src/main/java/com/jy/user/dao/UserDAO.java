package com.jy.user.dao;


import com.jy.user.vo.UserVO;

import java.util.List;

public interface UserDAO {

    List<UserVO> selUser(UserVO vo);

    List<UserVO> userList();

    int joinUser(UserVO vo);

}
