package com.jy.user.service;

import com.jy.user.vo.UserVO;

import java.util.List;

public interface UserService {

    List<UserVO> selUser(UserVO vo);

    List<UserVO> userList();

    int joinUser(UserVO vo);
}
