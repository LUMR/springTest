package dao.impl;

import dao.IDao;
import entity.User;

/**
 * Created by lumr on 2017/4/24.
 */
public class UserDao implements IDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户信息到数据库。");
    }
}
