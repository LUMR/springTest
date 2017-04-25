package service.impl;

import dao.IUserBiz;
import entity.User;
import service.IUserService;

/**
 * Created by fsweb on 17-4-25.
 */
public class UserServiceImpl implements IUserService{
    IUserBiz dao;
    @Override
    public void saveUser(User user) {
        dao.addNewUser(user);
    }

    public void setDao(IUserBiz dao) {
        this.dao = dao;
    }
}
