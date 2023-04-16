package ch13.web.userinfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        // DB 파일 읽는 원시적인 방법
        FileInputStream fis = new FileInputStream("main/db.properties");
        // Key = valus
        Properties prop = new Properties();

        // 파일 읽기 // DBTYPE="읽을 값"
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        UserInfo userInfo = new UserInfo();

        // 처음에는 어떤것 쓸지 정하지 않아 null
        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        }
        else {
            System.out.println("DB Error!");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
