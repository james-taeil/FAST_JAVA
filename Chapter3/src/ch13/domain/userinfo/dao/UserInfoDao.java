package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {

    // 선언을 하는 것
    // 유저에 대해 구현해야 할 기능을 선언 해두는 것
    // 버전마다 구현하면 된다.

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
