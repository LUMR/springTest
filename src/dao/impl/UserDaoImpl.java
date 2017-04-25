package dao.impl;

import dao.IDao;
import entity.User;

/**
 * Created by lumr on 2017/4/24.
 */
public class UserDaoImpl implements IDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户"+user.getName()+"信息到数据库。");
    }
}
