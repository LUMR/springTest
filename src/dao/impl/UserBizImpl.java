package dao.impl;

import dao.IDao;
import dao.IUserBiz;
import entity.User;

/**
 * Created by lumr on 2017/4/24.
 */
public class UserBizImpl implements IUserBiz {
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public void addNewUser(User user) {
        dao.save(user);
    }
}
