package test;

import dao.IUserBiz;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lumr on 2017/4/24.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        IUserBiz biz = (IUserBiz) ctx.getBean("userBiz");
        User user = new User("lumr");
        biz.addNewUser(user);
    }
}
