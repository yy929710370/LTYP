package cn.vworld.mapper;

import cn.vworld.bean.UserInfo;

public interface UserInfoMapper {

    void saveUserInfo(UserInfo userInfo);











    UserInfo findUserInfoById(String userInfoId);







































































































































    void updateUserInfo(UserInfo userInfo);

    void updateUserInfoByUser(UserInfo userInfo);
}
